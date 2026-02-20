package Synchronization;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value val = new Value(10);
        Lock lock = new ReentrantLock();
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        Adder addtask = new Adder(val , lock);
        Subtractor subtask = new Subtractor(val , lock);
        Future<Void> submitAdd =  executorService.submit(addtask);
        Future<Void> submitSub = executorService.submit(subtask);
        submitSub.get();
        submitAdd.get();
        System.out.println(val.val);
        executorService.shutdown();
    }
}
