package Synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value value;
    Lock lock;
    public  Adder(Value val , Lock lock){
        this.value = val;
        this.lock = lock;
    }
    public Void call() throws Exception {
        for(int i = 0 ; i<10 ; i++){
            lock.lock();
            this.value.val += i;
            lock.unlock();
        }
        return null;
    }
}
