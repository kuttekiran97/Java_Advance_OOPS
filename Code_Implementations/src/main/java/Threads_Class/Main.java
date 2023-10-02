package Threads_Class;

public class Main {
    public static void main(String[] args) {
        System.out.println("Printed by " + Thread.currentThread().getName());

        NumPrinter numPrinter = new NumPrinter();
        numPrinter.start();
    }
}


/*
1. If we use Thread class for creating the threads, in future we cant extent other classes as Java doesn't support Multiple Inheritance
2. Every main has a "main" thread and all other threads are created and executed by the main thread
*/