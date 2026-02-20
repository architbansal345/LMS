package DesignPattern.FactoryPattern.db;

import DesignPattern.FactoryPattern.factory.DatabaseFactory;
import DesignPattern.FactoryPattern.factory.NoSQLFactory;

public class NoSQL extends  Database {
    @Override
    public DatabaseFactory getDatabaseFactory() {
        return new NoSQLFactory();
    }
}
