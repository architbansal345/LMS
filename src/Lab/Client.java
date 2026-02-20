package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int randomNumber = 1000000;
        List<Integer>arr = new ArrayList<>();
        for(int i = 1; i<=randomNumber ; i++){
            arr.add(i);
        }
        int noOfCores = Runtime.getRuntime().availableProcessors();
        System.out.println(noOfCores);
        ExecutorService ex = Executors.newFixedThreadPool(noOfCores);
        int chunk = randomNumber/noOfCores;
        Future<Integer>[] futures = new Future[noOfCores];
        for(int i = 0 ; i<noOfCores ; i++){
             int s = i*chunk;
             int e = (i+1)*chunk;
             if(i == noOfCores - 1)e = randomNumber;
             MultiThreaded task = new MultiThreaded(arr, s , e);
             futures[i] = ex.submit(task);
        }
        long totalSum = 0;
        for(int i = 0 ; i<noOfCores ; i++){
            totalSum += futures[i].get();
        }
        System.out.println("totalSum" + totalSum);
        ex.shutdown();
    }
}
