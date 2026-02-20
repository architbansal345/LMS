package Lab.H2O;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Semaphore hsema = new Semaphore(2);
        Semaphore osema = new Semaphore(0);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable H = () -> {
            try {
                hsema.acquire(1);
                System.out.println("H");
                osema.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };
        Runnable O = () -> {
            try {
                osema.acquire(2);
                System.out.println("O");
                hsema.release(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        };
        for(int i = 0 ; i<10 ; i++){
            executorService.execute(H);
            executorService.execute(O);
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
    }
}
