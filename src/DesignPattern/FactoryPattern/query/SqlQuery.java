package DesignPattern.FactoryPattern.query;

public class SqlQuery implements Query {
    @Override
    public void executeQuery() {
        System.out.println("SQL Query executed");
    }
}
