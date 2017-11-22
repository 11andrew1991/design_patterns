package cookingrobotapp;

public class Main {

    public static void main(String[] args) {
        RobotContext robot = new RobotContext();

        robot.walk();
        robot.cook();

        System.out.println("------------");

        robot.walk();
        robot.off();

        System.out.println("------------");

        robot.walk();
        robot.off();

        System.out.println("------------");

        robot.cook();
    }
}
