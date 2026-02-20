package MergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer>arr = List.of(3,2,3,5,67,2,8,1,4);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter sorter = new Sorter(arr , executorService);
        Future<List<Integer>>future  = executorService.submit(sorter);
        List<Integer>sorted = future.get();
        System.out.println(sorted);
        executorService.shutdown();
    }
}
