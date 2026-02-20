package DesignPattern.FactoryPattern.transaction;

public class NoSQLTransation implements Transaction {
    @Override
    public void commit() {
        System.out.println("NoSQL Transaction committed");
    }
}
