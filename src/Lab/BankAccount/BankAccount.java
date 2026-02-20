package Lab.BankAccount;

public class BankAccount {
    private long balance = 0L;
    public long getBalance(){
        return this.balance;
    }
    public  void setBalance(Long balance){
        this.balance= balance;
    }
    public synchronized void withDraw(Long amount){
        this.balance -= amount;
    }
    public synchronized void deposit(Long amount){
        this.balance += amount;
    }
}
