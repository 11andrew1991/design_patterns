package mediator.chat.app;

import java.util.ArrayList;
import java.util.List;

/**
 * ConcreteMediator - Implements cooperative behavior by coordinating Colleague objects. It also knows and maintains its colleagues.
 */
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User originalUser) {
        for (User user : this.users) {
            //message should not be received by the user sending it
            if (user != originalUser) {
                user.receive(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
