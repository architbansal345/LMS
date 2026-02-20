package Semaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        Semaphore producersema = new Semaphore(5);
        Semaphore consumersema = new Semaphore(0);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 1 ; i<=8 ; i++){
            Producer p = new Producer(store , producersema , consumersema);
            executorService.execute(p);
        }
        for(int i = 1 ; i<=20 ; i++){
            Consumer c = new Consumer(store ,producersema , consumersema);
            executorService.execute(c);
        }
        executorService.shutdown();
    }
}
