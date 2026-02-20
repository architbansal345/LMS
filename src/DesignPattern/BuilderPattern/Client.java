package DesignPattern.BuilderPattern;

public class Client {
    public  static void main(String[] args) {
        MessageBuilder messageBuilder = MessageBuilder.create().setContent("Archit").setIsDelivered(true).build();
        System.out.println(messageBuilder.getContent());
    }
}
