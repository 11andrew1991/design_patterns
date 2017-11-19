package cookingrobotapp;

public class RoboticCook implements RoboticState {

    private final Robot robot;

    public RoboticCook(Robot robot) {
        this.robot = robot;
    }

    public void walk() {
        System.out.println("Walking...");
        robot.setRoboticState(robot.getRoboticOn());
    }

    public void cook() {
        System.out.println("Cooking...");
    }

    public void off() {
        System.out.println("Cannot switched off while cooking...");
    }
}
