package com.example.thread;

class MyThread implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("MyThread "+i);
        }
    }
}
public class CreateThreadUsingRunnable {

    public static void main(String[] args) {
        MyThread myThread= new MyThread();
        Thread thread= new Thread(myThread);
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main "+i);
        }
    }
}
