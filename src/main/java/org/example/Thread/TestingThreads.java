package org.example.Thread;


public class TestingThreads {
    public static void main(String[] args){

        Runnable runnable = new ThreadOne();
        Thread thread = new Thread(runnable);
        thread.start();
        thread.setPriority(10);


        Runnable runnable2 = new ThreadTwo();
        Thread thread2 = new Thread(runnable2);
        thread2.start();
        thread2.setPriority(5);


    }
}
