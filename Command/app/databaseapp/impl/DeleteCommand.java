package databaseapp.impl;

import databaseapp.Database;

/**
 * ConcreteCommand - Implements Execute by invoking the corresponding operation(s) on Receiver.
 */
public class DeleteCommand implements Command {

    /**
     * Receiver
     */
    private Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }

    @Override
    public void unExecute() {
        database.roleBack();
    }
}
