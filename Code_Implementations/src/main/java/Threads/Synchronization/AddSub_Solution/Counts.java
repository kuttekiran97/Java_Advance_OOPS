package Threads.Synchronization.AddSub_Solution;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Counts {
    private Integer value;

    public Counts(int value){
        this.value=value;
    }
}
