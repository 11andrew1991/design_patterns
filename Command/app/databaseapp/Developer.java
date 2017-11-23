package databaseapp;

import databaseapp.impl.Command;

/**
 * Invoker - Asks the command to carry out the request.
 */
public class Developer {

    private Command insert;

    private Command update;

    private Command select;

    private Command delete;

    public Developer(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public void insertRecord() {
        insert.execute();
        insert.unExecute();
    }

    public void updateRecord() {
        update.execute();
        update.unExecute();
    }

    public void deleteRecord() {
        delete.execute();
        delete.unExecute();
    }

    public void selectRecord() {
        select.execute();
    }
}
