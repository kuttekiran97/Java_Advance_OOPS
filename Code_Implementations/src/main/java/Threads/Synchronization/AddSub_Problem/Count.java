package Threads.Synchronization.AddSub_Problem;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Count {
    private Integer value;

    public Count(int value){
        this.value=value;
    }
}
