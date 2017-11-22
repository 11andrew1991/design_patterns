package cookingrobotapp;

import cookingrobotapp.states.RoboticCook;
import cookingrobotapp.states.RoboticOff;
import cookingrobotapp.states.RoboticOn;
import cookingrobotapp.states.RoboticState;

public class RobotContext implements RoboticState {

    private RoboticState roboticOn;

    private RoboticState roboticCook;

    private RoboticState roboticOff;

    private RoboticState state;

    public RobotContext() {
        this.roboticOn = new RoboticOn(this);

        this.roboticCook = new RoboticCook(this);

        this.roboticOff = new RoboticOff(this);

        this.state = roboticOn;
    }

    public void setRoboticState(RoboticState state) {
        this.state = state;
    }

    public void walk() {
        state.walk();
    }

    public void cook() {
        state.cook();
    }

    public void off() {
        state.off();
    }

    public RoboticState getRoboticOn() {
        return roboticOn;
    }

    public void setRoboticOn(RoboticState roboticOn) {
        this.roboticOn = roboticOn;
    }

    public RoboticState getRoboticCook() {
        return roboticCook;
    }

    public void setRoboticCook(RoboticState roboticCook) {
        this.roboticCook = roboticCook;
    }

    public RoboticState getRoboticOff() {
        return roboticOff;
    }

    public void setRoboticOff(RoboticState roboticOff) {
        this.roboticOff = roboticOff;
    }

    public RoboticState getState() {
        return state;
    }

    public void setState(RoboticState state) {
        this.state = state;
    }
}
