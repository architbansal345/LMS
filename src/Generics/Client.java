package Generics;

public class Client {
    public static void main(String[] args) {
        Testing<String , Integer> t = new Testing<>("hello" , 1);
        System.out.println(t.getFirst());
        System.out.println(t.getSecond());
    }
}
