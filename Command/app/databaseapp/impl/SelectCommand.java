package databaseapp.impl;

import databaseapp.Database;

public class SelectCommand implements Command {

    private Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}
