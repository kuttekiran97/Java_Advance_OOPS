package Threads.Synchronization.AddSub_Problem;

public class Subtract implements Runnable{

    private Count count;

    public Subtract(Count count){
        this.count=count;
    }
    @Override
    public void run() {
        for(int i=1;i<=1000;i++){
            Integer v = count.getValue();
            count.setValue(v-i);
        }

    }
}
