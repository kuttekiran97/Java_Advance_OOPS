package Threads_Runnable;


public class Main {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            NumGenerator numPrinter = new NumGenerator(i);
            Thread t1 = new Thread(numPrinter);

            t1.start();
        }
    }
}

/*
Using this method of creating threads, we can extend any other class which is needed
*/

