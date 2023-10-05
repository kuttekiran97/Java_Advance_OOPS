package Threads.Synchronization.AddSub_Solution;

import Threads.Synchronization.AddSub_Problem.Adder;
import Threads.Synchronization.AddSub_Problem.Count;
import Threads.Synchronization.AddSub_Problem.Subtract;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Client {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        Counts counts = new Counts(0);
        Adders adder = new Adders(counts,lock);
        Subtracts subtract = new Subtracts(counts,lock);

        //Using simple Thread method also works as shown comment in below
//        Thread t1 = new Thread(adder);
//        Thread t2 = new Thread(subtract);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(adder);
        executor.execute(subtract);

        executor.awaitTermination(1,TimeUnit.SECONDS);

        System.out.println("Final value : " + counts.getValue());

    }

}

