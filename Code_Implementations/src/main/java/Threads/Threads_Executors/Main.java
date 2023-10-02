package Threads.Threads_Executors;

import Threads.Threads_Runnable.NumGenerator;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(50);

        for(int i =0 ; i<=100 ; i++){
            NumGenerator numGenerator = new NumGenerator(i);
            executor.execute(numGenerator);

        }
    }
}
