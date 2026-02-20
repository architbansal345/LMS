package DesignPattern.FactoryPattern;

import DesignPattern.FactoryPattern.db.NoSQL;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserService(new NoSQL());
        userService.createUser();
        userService.executeUserTransaction();
    }
}
