package Threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0 ; i<1000 ; i++) {
            System.out.println("DEBUG");
            NumberPrinter np = new NumberPrinter(i);
            executorService.execute(np);
        }
        executorService.shutdown();
    }
}
