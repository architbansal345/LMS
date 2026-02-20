package Lab.Scrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<String> urls = new ArrayList<>();
        for(int i = 1 ; i<=100 ; i++){
            urls.add("https://example/page"+i);
        }
        ExecutorService ex = Executors.newFixedThreadPool(10);
        long fixedTime = executeTask(urls , ex);
        System.out.println("Fixed Time "  + fixedTime);

        ExecutorService exC = Executors.newCachedThreadPool();
        long cachedTime = executeTask(urls , exC);
        System.out.println("Cached Time "  + cachedTime);


    }
    private static long executeTask(List<String>urls , ExecutorService executorService) throws ExecutionException, InterruptedException {
        List<Future<Void>> futures = new ArrayList<>();
        long start = System.currentTimeMillis();
        for(String url : urls){
            futures.add(executorService.submit(new Scrapper(url)));
        }
        for(Future<Void>future:futures){
            future.get();
        }
        long end = System.currentTimeMillis();
        executorService.shutdown();
        return end-start;
    }
}
