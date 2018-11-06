package com.ProducerConsumer;

public class Main {
    private static final int ZERO =0;
    private static final int MAX_SIZE=25;
    final BufferManager bufferManager = new BufferManager();
    public void startThread() throws InterruptedException {
       Thread producer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bufferManager.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bufferManager.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bufferManager.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bufferManager.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer4 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bufferManager.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer5 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    bufferManager.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        producer.setName("Producer");
        consumer1.setName("Consumer1");
        consumer2.setName("Consumer2");
        consumer3.setName("Consumer3");
        consumer4.setName("Consumer4");
        consumer5.setName("Consumer5");

        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
        consumer4.start();
        consumer5.start();

        producer.join();
        consumer1.join();
        consumer2.join();
        consumer3.join();
        consumer4.join();
        consumer5.join();
    }

}
