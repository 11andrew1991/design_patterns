package mediator.chatroom.app;

/**
 * Mediator - Defines an interface for communicating with Colleague objects.
 */
public interface Mediator {

    void send(String message, Colleague colleague);
}