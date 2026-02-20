package Semaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements  Runnable {
    private Store store;
    private Semaphore producersema;
    private Semaphore consumersema;
    public Consumer(Store store , Semaphore producersema , Semaphore consumersema ){
        this.store = store;
        this.producersema = producersema;
        this.consumersema = consumersema;
    }
    @Override
    public void run() {
        while(true){
            try {
                consumersema.acquire();
                store.removeItems();
                producersema.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
