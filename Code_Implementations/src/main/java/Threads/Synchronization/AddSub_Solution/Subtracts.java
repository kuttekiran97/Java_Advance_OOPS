package Threads.Synchronization.AddSub_Solution;

import lombok.AllArgsConstructor;

import java.util.concurrent.locks.Lock;

@AllArgsConstructor

public class Subtracts implements Runnable{

    private Counts count;
    private Lock lock;

    @Override
    public void run() {
        for(int i=1;i<=1000;i++) {
            /*Instead of Synchronized Keyword, we can use "lock" object as well
            lock.lock();
            Integer v = count.getValue();
            count.setValue(v + i);
            lock.unlock(); */

            synchronized (count) {
                    Integer v = count.getValue();
                    count.setValue(v - i);
                }


        }
        }

    }

