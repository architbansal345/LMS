package Lab.BankAccount;

public class Depositor implements Runnable{
    private BankAccount bankAccount;
    public void run(){
        bankAccount.deposit(1000L);
    }
}
