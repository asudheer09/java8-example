package com.example.thread;

class Thread1 extends Thread{
    @Override
    public void run() {
        synchronized(Thread1.class){
            for (int i = 0; i < 10; i++) {
                System.out.println(" " + i + " " + Thread.currentThread().getName());
            }
        };

    }
}

public class CreateThreadUsingThreadClass {
    public static void main(String[] args) {
        Thread1 thread1= new Thread1();
        Thread1 thread2= new Thread1();
        thread1.start();
        thread2.start();
    }
}
