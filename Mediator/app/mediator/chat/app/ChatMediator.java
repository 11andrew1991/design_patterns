package mediator.chat.app;

/**
 * Mediator - Defines an interface for communicating with Colleague objects.
 */
public interface ChatMediator {

    void sendMessage(String msg, User user);

    void addUser(User user);
}
