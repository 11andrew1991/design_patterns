package humanactivityapp;

public class Work implements Activity {

    private int count;

    public void doSomething(Human context) {
        if (count < 5) {
            System.out.println("WORKING ...");
            count++;
        } else {
            context.setState(new Weekend());
        }
    }
}
