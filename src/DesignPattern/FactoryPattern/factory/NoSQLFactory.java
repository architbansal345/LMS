package DesignPattern.FactoryPattern.factory;

import DesignPattern.FactoryPattern.query.NoSQLQuery;
import DesignPattern.FactoryPattern.query.Query;
import DesignPattern.FactoryPattern.transaction.NoSQLTransation;
import DesignPattern.FactoryPattern.transaction.Transaction;

public class NoSQLFactory implements DatabaseFactory {
    @Override
    public Query getQuery() {
        return new NoSQLQuery();
    }

    @Override
    public Transaction getTransaction() {
        return new NoSQLTransation();
    }
}
