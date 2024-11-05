import java.util.*;

class Game {
    int Target_number, Guessed_number;
    int Score = 100;

    Game(int Target_number) {
        this.Target_number = Target_number;
    }

    boolean GameProcess(int Guessed_number) {
        this.Guessed_number = Guessed_number;
        if (Guessed_number == Target_number) {
            System.out.println("Congratulations you guessed correctly!");
			System.out.println();
            System.out.println("Your Score = " + Score);
            return true;
        } else if (Guessed_number < Target_number) {
            Score -= 20;
					
			
            System.out.println("Wrong number, please try again...");
			System.out.println();
            System.out.println("Hint: Target number is Too High!");
			System.out.println();
            System.out.println("Your Score = " + Score);
			System.out.println();
        } else {
            Score -= 20;
					
		    
			System.out.println("Wrong number, please try again...");
			System.out.println();
            System.out.println("Hint: Target number is Too Low!");
			System.out.println();
            System.out.println("Your Score = " + Score);
			System.out.println();
        }
        return false;
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int Target = random.nextInt(1,101);
        int Guessed;
        int retries = 0;
        boolean guessedCorrectly = false;
		
		System.out.println("===================Number Guessing Game===================");
		
		System.out.println();

        Game game = new Game(Target);

        while (retries < 5 && !guessedCorrectly) {
            System.out.print("Enter your guessed number from 1 to 100 : ");
            Guessed = s.nextInt();
			System.out.println();

            guessedCorrectly = game.GameProcess(Guessed);

            if (!guessedCorrectly) {
                retries++;
                if (retries < 5) {
                    System.out.println("You have " + (5 - retries) + " retries left.");
					System.out.println();
                } else {
                    System.out.println("Sorry, you've exhausted all retries. The target number was: " + Target);
                }
            }
        }
    }
}
