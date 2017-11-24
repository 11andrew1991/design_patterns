package databaseapp;

/**
 * Receiver - Knows how to perform the operations associated with carrying out a request. Any class may serve as a Receiver.
 */
public class Database {

    public void insert() {
        System.out.println("Inserting record ...");
    }

    public void update() {
        System.out.println("Updating record ...");
    }

    public void select() {
        System.out.println("Selecting record ...");
    }

    public void delete() {
        System.out.println("Deleting record ...");
    }

    public void rollBack() {
        System.out.println("Roll back record ...");
    }
}
