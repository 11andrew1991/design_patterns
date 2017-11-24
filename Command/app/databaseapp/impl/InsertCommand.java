package databaseapp.impl;

import databaseapp.Database;

/**
 * ConcreteCommand - Implements Execute by invoking the corresponding operation(s) on Receiver.
 */
public class InsertCommand implements Command {

    /**
     * Receiver
     */
    private Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }

    @Override
    public void unExecute() {
        database.rollBack();
    }
}
