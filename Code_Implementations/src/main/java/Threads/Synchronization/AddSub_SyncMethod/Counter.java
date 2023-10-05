package Threads.Synchronization.AddSub_SyncMethod;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Counter {
    private int value ;

    public synchronized void increment(int i){
        this.value+=i;
    }

    public synchronized void decrement(int i){
        this.value-=i;
    }


}
