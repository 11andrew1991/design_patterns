package databaseapp;

import databaseapp.impl.DeleteCommand;
import databaseapp.impl.InsertCommand;
import databaseapp.impl.SelectCommand;
import databaseapp.impl.UpdateCommand;

public class DatabaseRunner {

    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecord();
        developer.updateRecord();
        developer.selectRecord();
        developer.deleteRecord();
    }
}
