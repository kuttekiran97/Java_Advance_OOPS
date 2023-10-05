package Threads.Synchronization.AddSub_SyncMethod;

public class Sub implements Runnable{

    private Counter counter;

    public Sub(Counter counter){
        this.counter=counter;
    }
    @Override
    public void run() {
        for(int i =0;i<100;i++){
            counter.decrement(i);
        }

    }
}
