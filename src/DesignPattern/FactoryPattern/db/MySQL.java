package DesignPattern.FactoryPattern.db;

import DesignPattern.FactoryPattern.factory.DatabaseFactory;
import DesignPattern.FactoryPattern.factory.MySQLFactory;

public class MySQL extends Database {
    @Override
    public DatabaseFactory getDatabaseFactory() {
        return new MySQLFactory();
    }
}
