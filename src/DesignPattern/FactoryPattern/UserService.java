package DesignPattern.FactoryPattern;

import DesignPattern.FactoryPattern.db.Database;
import DesignPattern.FactoryPattern.factory.DatabaseFactory;
import DesignPattern.FactoryPattern.query.Query;
import DesignPattern.FactoryPattern.transaction.Transaction;

public class UserService {
    Database db; // dependency Inversion
    public UserService(Database db) {
        this.db = db;
    }
    public void createUser() {
        DatabaseFactory dbfactory = db.getDatabaseFactory();
        Query q = dbfactory.getQuery();
        q.executeQuery();

    }
    public void executeUserTransaction() {
        DatabaseFactory dbfactory = db.getDatabaseFactory();
        Transaction t = dbfactory.getTransaction();
        t.commit();
    }
}
