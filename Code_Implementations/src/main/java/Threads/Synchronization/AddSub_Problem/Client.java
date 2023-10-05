package Threads.Synchronization.AddSub_Problem;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count(0);
        Adder adder = new Adder(count);
        Subtract subtract = new Subtract(count);

    //Using simple Thread method also works as shown comment in below
//        Thread t1 = new Thread(adder);
//        Thread t2 = new Thread(subtract);

//        t1.start();
//        t2.start();


        ExecutorService executor = Executors.newCachedThreadPool();

        executor.execute(adder);
        executor.execute(subtract);

        executor.awaitTermination(1, TimeUnit.SECONDS);


        System.out.println("Final value : " + count.getValue());
    }
}
