package cookingrobotapp.states;

import cookingrobotapp.RobotContext;

public class RoboticStandby implements RoboticState {

    private final RobotContext robot;

    public RoboticStandby(RobotContext robot) {
        this.robot = robot;
    }

    public void walk() {
        System.out.println("In standby state...");
        robot.setState(robot.getRoboticOn());
        System.out.println("Walking...");
    }

    public void cook() {
        System.out.println("In standby state...");
        robot.setRoboticState(robot.getRoboticCook());
        System.out.println("Cooking...");
    }

    public void off() {
        System.out.println("In standby state...");
        robot.setState(robot.getRoboticOff());
        System.out.println("Robot is switched off");
    }
}
