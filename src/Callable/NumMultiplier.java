package Callable;

import java.util.concurrent.Callable;

public class NumMultiplier implements Callable<Integer> {
    int value;
    public NumMultiplier(int value){
        this.value = value;
    }
    @Override
    public Integer call() throws Exception {
        return value*5;
    }
}
