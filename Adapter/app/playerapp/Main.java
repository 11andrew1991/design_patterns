package playerapp;

public class Main {

    public static void main(String[] args) {
        Player player = new PlayerAdapter();

        player.start();
        player.pause();
        player.stop();
    }
}