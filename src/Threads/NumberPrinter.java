package Threads;

public class NumberPrinter implements  Runnable{
    int x;
    public NumberPrinter(int x){
        this.x = x;
    }
    public void run(){
        print(this.x);
    }
    public void print(int x){
        System.out.println("Number is " + x + " thread is " + Thread.currentThread().getName());
    }
}
