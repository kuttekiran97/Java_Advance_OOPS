package Threads.Threads_Class;

public class NumPrinter extends Thread {

    @Override
    public void run() {
        System.out.println("Hello,its NumPrinter and printed by " + Thread.currentThread().getName());
    }
}
