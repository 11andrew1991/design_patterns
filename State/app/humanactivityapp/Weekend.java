package humanactivityapp;

public class Weekend implements Activity {

    public void doSomething(Human context) {
        System.out.println("WEEKEND (Zzzz....)");
        context.setState(new Work());
    }
}
