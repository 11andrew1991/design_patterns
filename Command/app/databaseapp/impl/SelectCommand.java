package databaseapp.impl;

import databaseapp.Database;

/**
 * ConcreteCommand - Implements Execute by invoking the corresponding operation(s) on Receiver.
 */
public class SelectCommand implements Command {

    /**
     * Receiver
     */
    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }

    @Override
    public void unExecute() {
        database.rollBack();
    }
}
