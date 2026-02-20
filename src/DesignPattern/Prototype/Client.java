package DesignPattern.Prototype;

public class Client {
    public static void main(String[] args) {
        User user = new User("Archit","1234");
        User user2 = user.cloneObject();
        System.out.println(user);
        System.out.println(user2);
    }
}
