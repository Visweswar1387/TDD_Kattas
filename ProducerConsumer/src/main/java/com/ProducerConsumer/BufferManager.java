package com.ProducerConsumer;

import java.sql.Connection;
import java.util.ArrayList;

public final class BufferManager {
    static volatile ArrayList<Connection> buffer = new ArrayList<>();
    private static final int BUFFER_CAPACITY = 25;
    private static final int ZERO = 25;
    public void produce() throws InterruptedException {
        while(true) {
            synchronized (this) {
                while(buffer.size()<BUFFER_CAPACITY) {
                    buffer.add(DbConnection.getConnection());
                    System.out.println("Producer produced Item: "+Thread.currentThread().getName());
                    notifyAll();
                }
                if(buffer.size()==BUFFER_CAPACITY) {
                    Thread.sleep(1000);
                    notifyAll();
                }
            }
        }
    }
    public void consume() throws InterruptedException {
        while(true) {
            synchronized (this) {
                while(buffer.size()==0) {
                    notifyAll();
                    wait();
                }
                buffer.remove(0);
                System.out.println("Consumer consume Item: "+ Thread.currentThread().getName());
                notifyAll();
                Thread.sleep(1000);
            }
        }
    }

}
