package mediator.chatroom.app;

/**
 * Colleague Classes - Each Colleague class knows its Mediator object.
 * Each colleague communicates with its mediator whenever it would have otherwise communicated with another colleague.
 */
public class MobileColleague extends Colleague {

    public MobileColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Mobile Received: " + message);
    }
}
