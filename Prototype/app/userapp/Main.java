package userapp;

public class Main {

    private static final String FIRST_NAME = "Andrei";

    private static final String LAST_NAME = "Varzari";

    private static final int AGE = 26;

    public static void main(String[] args) {
        User user = new User(FIRST_NAME, LAST_NAME, AGE);
        System.out.println(user);
        System.out.println("----------------------------");

        User user1 = user;
        System.out.println(user1);
        System.out.println("----------------------------");

        User user2 = (User)user.copy();
        System.out.println(user2);
    }
}