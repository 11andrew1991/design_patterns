package databaseapp.impl;

import databaseapp.Database;

public class UpdateCommand implements Command {

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