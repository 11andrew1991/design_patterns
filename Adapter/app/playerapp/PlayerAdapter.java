package playerapp;

public class PlayerAdapter extends NewPlayer implements Player {

    public void start() {
        super.playSound();
    }

    public void pause() {
        super.pauseSound();
    }

    public void stop() {
        super.stopSound();
    }
}
