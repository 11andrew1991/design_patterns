package cookingrobotapp;

public class RoboticOn implements RoboticState {

    private final Robot robot;

    public RoboticOn(Robot robot) {
        this.robot = robot;
    }

    public void walk() {
        System.out.println("Walking...");
    }

    public void cook() {
        System.out.println("Cooking...");
        robot.setRoboticState(robot.getRoboticCook());
    }

    public void off() {
        robot.setState(robot.getRoboticOff());
        System.out.println("Robot is switched off");
    }
}
