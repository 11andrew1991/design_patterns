package databaseapp.impl;

public interface Command {

    void execute();

    void unExecute();
}
