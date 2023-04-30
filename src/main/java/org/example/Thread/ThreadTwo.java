package org.example.Thread;

public class ThreadTwo implements Runnable{

    int countdown = ThreadOne.time * ThreadOne.endCount;
    @Override
    public void run() {

        try {
            Thread.sleep(countdown);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\n--------------");
        System.out.println("Test Completed");



    }
}
