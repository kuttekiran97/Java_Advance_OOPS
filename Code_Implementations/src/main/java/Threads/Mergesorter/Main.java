package Threads.Mergesorter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(20);
        list.add(80);
        list.add(40);
        list.add(85);
        list.add(50);
        list.add(42);
        list.add(20);
        list.add(33);
        list.add(7);
        list.add(99);


        ExecutorService executorService = Executors.newFixedThreadPool(20);

        MergeSorter mergeSorter = new MergeSorter(list,executorService);

        Future<List<Integer>> Final = executorService.submit(mergeSorter);

        System.out.println(Final.get());

        executorService.shutdown();




    }
}


