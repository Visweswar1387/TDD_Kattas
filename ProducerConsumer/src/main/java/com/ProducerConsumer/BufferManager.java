package com.ProducerConsumer;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class BufferManager {
    CheckSelfishThread checkSelfishThread=new CheckSelfishThread();
    static volatile ArrayList<Connection> buffer = new ArrayList<>();
    private static final int BUFFER_CAPACITY = 25;
    private static final int ZERO = 25;
    private Connection connection;

    public void produce() throws InterruptedException {
        while(true) {
            synchronized (this) {
                while(buffer.size()<BUFFER_CAPACITY) {
                    buffer.add(DbConnection.getConnection());
                    System.out.println("Producer produced Item: "+Thread.currentThread().getName());
                }
                if(buffer.size()==BUFFER_CAPACITY) {
                    wait();
                }
            }
        }
    }
    public void consume() throws InterruptedException {
        while(true) {
            synchronized (this) {
                if(checkSelfishThread.checkSelfish(Thread.currentThread().getName())) {
                    notifyAll();
                    wait();
                } else {
                    connection=buffer.remove(0);
                    returnConnectionAfterSomeTime(connection);
                    wait(1000);
                    // notify producer
                    notifyAll();
                    System.out.println("Consumer consume Item: "+ Thread.currentThread().getName());
                }
            }
        }
    }

    private void returnConnectionAfterSomeTime(Connection returnConnection) {
        Thread user = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    returnConnection.close();
                } catch (InterruptedException | SQLException e) {
                    e.printStackTrace();
                }
            }
        });
        user.start();
    }

}
