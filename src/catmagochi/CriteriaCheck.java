package catmagochi;

public class CriteriaCheck {

    // Takes attributes mood, hunger, health and name
    // returns boolean flag true if criteria is met
    public boolean checkWinLose(int mood, int hunger, int health, String name) {

        // boolean flag
        boolean winLose = false;

        // Criteria for winning the game: mood = 10 & hunger = 0
        // Evaluate mood & hunger and return true if criteria is met
        if (mood == 10 && hunger == 0) {
            System.out.println("Congratulations your " + name + " is perfectly happy. You have won the game!");
            System.out.println();
            winLose = true;
        }

        // Criteria for loosing the game: health = 0
        // Evaluate health of cat name and return true if criteria is met
        if(health < 1) {
            System.out.println("Oh no, you killed " + name + ". You bastard!");
            System.out.println();
            winLose = true;
        }

        return winLose;
    }
}

