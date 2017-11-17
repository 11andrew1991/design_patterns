package commentaryuserapp;

import java.util.Observable;
import java.util.Observer;

public class SMSUsersObserver implements Observer {

    private String description;

    private final String userInfo;

    private final Observable observable;

    public SMSUsersObserver(Observable observable, String userInfo) {
        this.userInfo = userInfo;
        this.observable = observable;
    }

    public void subscribe() {
        System.out.println("Subscribing " + this.userInfo + " to " + ((CommentaryObjectObservable) (observable)).getSubjectDetails());
        this.observable.addObserver(this);
        System.out.println("Subscribed successfully.\n");
    }

    public void unSubscribe() {
        System.out.println("Unsubscribing " + this.userInfo + " to " + ((CommentaryObjectObservable) (observable)).getSubjectDetails());
        this.observable.deleteObserver(this);
        System.out.println("Unsubscribed successfully.\n");
    }

    public void update(Observable o, Object arg) {
        this.description = (String) arg;
        this.display();
    }

    private void display(){
        System.out.println("[" + userInfo + "]: " + description);
    }
}
