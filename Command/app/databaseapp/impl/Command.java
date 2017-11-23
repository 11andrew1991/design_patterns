package databaseapp.impl;

/**
 * Command - Declares an interface for executing an operation.
 */
public interface Command {

    void execute();

    void unExecute();
}
