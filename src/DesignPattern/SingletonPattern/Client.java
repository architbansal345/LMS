package DesignPattern.SingletonPattern;

public class Client {
    public static void main(String[] args) {
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        SingletonPattern singletonPattern1 = SingletonPattern.getInstance();
        System.out.println(singletonPattern);
    }
}
