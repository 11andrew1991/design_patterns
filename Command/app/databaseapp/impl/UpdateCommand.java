package databaseapp.impl;

import databaseapp.Database;

/**
 * ConcreteCommand - Implements Execute by invoking the corresponding operation(s) on Receiver.
 */
public class UpdateCommand implements Command {

    /**
     * Receiver
     */
    private Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }

    @Override
    public void unExecute() {
        database.roleBack();
    }
}
