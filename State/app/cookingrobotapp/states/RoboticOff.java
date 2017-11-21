package cookingrobotapp.states;

import cookingrobotapp.RobotContext;

public class RoboticOff implements RoboticState {

    private final RobotContext robot;

    public RoboticOff(RobotContext robot) {
        this.robot = robot;
    }

    public void walk() {
        System.out.println("Walking...");
        robot.setRoboticState(robot.getRoboticOn());
    }

    public void cook() {
        System.out.println("Cannot cook at Off state.");
    }

    public void off() {
        System.out.println("Already switched off...");
    }
}
