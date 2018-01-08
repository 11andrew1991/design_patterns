package mediator.chatroom.app;

/**
 * Colleague Classes - Each Colleague class knows its Mediator object.
 * Each colleague communicates with its mediator whenever it would have otherwise communicated with another colleague.
 */
public class ConcreteColleague extends Colleague {

    public ConcreteColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague Received: " + message);
    }
}
