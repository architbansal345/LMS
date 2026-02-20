package DesignPattern.FactoryPattern.transaction;

public class MySqlTransaction implements Transaction {
    @Override
    public void commit() {
        System.out.println("SQL Transaction commited");
    }
}
