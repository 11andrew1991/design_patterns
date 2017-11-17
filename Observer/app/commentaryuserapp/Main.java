package commentaryuserapp;

public class Main {

    public static void main(String[] args) {
        CommentaryObjectObservable obj = new CommentaryObjectObservable("JAVA News");

        SMSUsersObserver javaJunior = new SMSUsersObserver(obj, "Java Junior Developer");
        SMSUsersObserver javaSenior = new SMSUsersObserver(obj, "Java Senior Developer");

        javaJunior.subscribe();
        javaSenior.subscribe();

        obj.setDescription("Welcome to LIVE java news");
        obj.setDescription("Welcome to JAVA 8");
        System.out.println("\n");

        javaJunior.unSubscribe();

        obj.setDescription("Welcome to JAVA 9");
        obj.setDescription("Welcome to JAVA 10");
    }
}
