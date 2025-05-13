public class Game {
    
import Utils.ConfigUtils;

public class Game {
    private Player player;
    

    public void start() {
        ConfigUtils.println("Welcome to the game!");
        String playerName = ConfigUtils.askString("Enter your name: ");
        int age= ConfigUtils.askInt("Enter your age: ");
        player = new Player(playerName, age);
        ConfigUtils.println("Character created successfully!");
    }

    public void firstDecision() {
        ConfigUtils.println("You are in a dark forest. You can go left or right?");

        while (true) {
            String decission = ConfigUtils.askString("Enter your decision (left/right): ").toLowerCase();
            
    }