package Threads.Threads_Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        StringPrinter stringPrinter = new StringPrinter();
        Future<String> value = executorService.submit(stringPrinter);
        System.out.println(value.get());

        executorService.shutdown();

    }
}
