package org.example.Thread;


public class ThreadOne implements Runnable{
    public static final int time = 1000;
    public static final int endCount = 10;
    @Override
    public void run(){
        String testing = "Testing ";
        String period = ".";
        int i = 0;


        System.out.print(testing);

        while(i < 10){

            System.out.print(period);

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                throw new RuntimeException("Error with execution");
            }
            i++;
        }



    }
}
