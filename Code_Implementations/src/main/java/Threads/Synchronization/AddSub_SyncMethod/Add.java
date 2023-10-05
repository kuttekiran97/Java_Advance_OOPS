package Threads.Synchronization.AddSub_SyncMethod;

public class Add implements Runnable{

    private Counter counter;

    public Add(Counter counter){
        this.counter=counter;
    }
    @Override
    public void run() {
        for(int i =0;i<100;i++){
            counter.increment(i);
        }

    }
}
