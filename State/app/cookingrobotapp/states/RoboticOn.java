package cookingrobotapp.states;

import cookingrobotapp.RobotContext;

public class RoboticOn implements RoboticState {

    private final RobotContext robot;

    public RoboticOn(RobotContext robot) {
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
        System.out.println("RobotContext is switched off");
    }
}
