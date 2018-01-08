package mediator.chatroom.app;

import java.util.ArrayList;

/**
 * ConcreteMediator - Implements cooperative behavior by coordinating Colleague objects. It also knows and maintains its colleagues.
 */
public class ApplicationMediator implements Mediator {

    private ArrayList<Colleague> colleagues;

    public ApplicationMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    public void send(String message, Colleague originator) {
        //let all other screens know that this screen has changed
        for (Colleague colleague : colleagues) {
            //don't tell ourselves
            if (colleague != originator) {
                colleague.receive(message);
            }
        }
    }
}
