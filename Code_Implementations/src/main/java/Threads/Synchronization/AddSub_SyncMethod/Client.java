package Threads.Synchronization.AddSub_SyncMethod;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter(0);

        Add add = new Add(counter);
        Sub sub= new Sub(counter);

//        Thread t1 = new Thread(add);
//        Thread t2 = new Thread(sub);
//
//        t1.start();
//        t2.start();
//
//        t1.join();
//        t2.join();

        ExecutorService executor = Executors.newCachedThreadPool();
        executor.execute(add);
        executor.execute(sub);

        executor.awaitTermination(1, TimeUnit.SECONDS);

        System.out.println("Final value is :" + counter.getValue());
    }
}
