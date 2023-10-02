package Threads.Threads_Callable;

import java.util.concurrent.Callable;

public class StringPrinter implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Hello,its callable";
    }
}
