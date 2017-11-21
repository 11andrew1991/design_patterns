package cookingrobotapp.states;

import cookingrobotapp.RobotContext;

public class RoboticCook implements RoboticState {

    private final RobotContext robot;

    public RoboticCook(RobotContext robot) {
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
