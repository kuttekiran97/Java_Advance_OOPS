package Threads_Runnable;

public class NumberExecutor implements Runnable{


    private int num;

    @Override
    public void run() {
        System.out.println("Number" + num + "is printed by " + Thread.currentThread().getName());
    }
}
