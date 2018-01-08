package mediator.chat.app;

public class Main {

    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User natasha = new UserImpl(mediator, "Natasha");
        User vladimir = new UserImpl(mediator, "Vladimir");
        User masha = new UserImpl(mediator, "Masha");
        User alena = new UserImpl(mediator, "Alena");

        mediator.addUser(natasha);
        mediator.addUser(vladimir);
        mediator.addUser(masha);
        mediator.addUser(alena);

        alena.send("Hi All");
    }

}
