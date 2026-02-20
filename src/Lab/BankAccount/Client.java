package Lab.BankAccount;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount();
        Runnable DepositAmount = () -> {
            bankAccount.deposit(1000L);
        };
        Runnable WithDrawAmount = () -> {
            bankAccount.withDraw(1000L);
        };
        ExecutorService executorService = Executors.newCachedThreadPool();
        long start = System.currentTimeMillis();
        for(int i = 0 ; i<10 ; i++){
            executorService.execute(DepositAmount);
            executorService.execute(WithDrawAmount);
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        long end = System.currentTimeMillis();
    }
}
