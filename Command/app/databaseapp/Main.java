package databaseapp;

import databaseapp.impl.DeleteCommand;
import databaseapp.impl.InsertCommand;
import databaseapp.impl.SelectCommand;
import databaseapp.impl.UpdateCommand;

/**
 * Client - Creates a ConcreteCommand object and sets its receiver
 */
public class Main {

    public static void main(String[] args) {
        Database database = new Database();

        Developer developer = new Developer(
                new InsertCommand(database),
                new UpdateCommand(database),
                new SelectCommand(database),
                new DeleteCommand(database)
        );

        developer.insertRecord();
        System.out.println("----------------");

        developer.updateRecord();
        System.out.println("----------------");

        developer.selectRecord();
        System.out.println("----------------");

        developer.deleteRecord();
    }
}
