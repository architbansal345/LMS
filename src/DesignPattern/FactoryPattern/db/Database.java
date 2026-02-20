package DesignPattern.FactoryPattern.db;

import DesignPattern.FactoryPattern.factory.DatabaseFactory;

public abstract class Database {
    public abstract DatabaseFactory getDatabaseFactory();
}
