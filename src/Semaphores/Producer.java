package Semaphores;

import java.util.concurrent.Semaphore;

public class Producer  implements  Runnable{
    private Store store;
    private Semaphore producersema;
    private Semaphore consumersema;
    public Producer(Store store , Semaphore producersema , Semaphore consumersema ){
        this.store = store;
        this.producersema = producersema;
        this.consumersema = consumersema;
    }
    @Override
    public void run() {
        while(true){
            try {
                producersema.acquire();
                store.addItems(new Object());
                consumersema.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
