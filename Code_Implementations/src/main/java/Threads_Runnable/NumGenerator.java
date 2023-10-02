package Threads_Runnable;


import lombok.AllArgsConstructor;

@AllArgsConstructor

public class NumGenerator implements Runnable{
    private int num;

    @Override
    public void run() {

        System.out.println("Number" + num + "is printed by " + Thread.currentThread().getName());

    }
}




