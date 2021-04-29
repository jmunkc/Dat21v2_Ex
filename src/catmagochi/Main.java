package catmagochi;

public class Main {

    public static void main(String[] args) {
        System.out.println("##################################");
        System.out.println("### Welcome To The Catmagochi! ###");
        System.out.println("##################################");
        System.out.println();

        // Instantiate menu object in variable run
        Game run = new Game();

        // Call method to run game
        run.runGame();
    }
}
