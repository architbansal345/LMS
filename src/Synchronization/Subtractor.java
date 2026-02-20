package Synchronization;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Value value;
    Lock lock;
    public  Subtractor(Value val , Lock lock){
        this.value = val;
        this.lock = lock;
    }
    public Void call() throws Exception {
        for(int i = 0 ; i<10 ; i++){
//            lock.lock();
            synchronized (value){
                this.value.val -= i;
            }
//            lock.unlock();
        }
        return null;
    }
}
