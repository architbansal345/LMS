package DesignPattern.FactoryPattern.factory;

import DesignPattern.FactoryPattern.query.Query;
import DesignPattern.FactoryPattern.transaction.Transaction;

public interface DatabaseFactory {
    public abstract Query getQuery();
    public abstract Transaction getTransaction();
}
