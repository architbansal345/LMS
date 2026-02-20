package DesignPattern.FactoryPattern.query;

public class NoSQLQuery implements Query {
    @Override
    public void executeQuery() {
        System.out.println("NoSQL Query executed");
    }
}
