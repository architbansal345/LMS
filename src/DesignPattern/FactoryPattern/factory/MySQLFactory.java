package DesignPattern.FactoryPattern.factory;

import DesignPattern.FactoryPattern.query.Query;
import DesignPattern.FactoryPattern.query.SqlQuery;
import DesignPattern.FactoryPattern.transaction.MySqlTransaction;
import DesignPattern.FactoryPattern.transaction.Transaction;

public class MySQLFactory implements DatabaseFactory {
    @Override
    public Query getQuery() {
        return new SqlQuery();
    }

    @Override
    public Transaction getTransaction() {
        return new MySqlTransaction();
    }
}
