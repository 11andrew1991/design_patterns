package databaseapp;

import databaseapp.impl.Command;

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
    }

    public void updateRecord() {
        update.execute();
    }

    public void deleteRecord() {
        delete.execute();
    }

    public void selectRecord() {
        select.execute();
    }
}
