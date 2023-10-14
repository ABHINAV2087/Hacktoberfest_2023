import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] options = {"Rock", "Paper", "Scissors"};

        while (true) {
            System.out.println("\nLet's play Rock, Paper, Scissors!");
            System.out.println("Enter your choice (Rock, Paper, Scissors) or 'quit' to exit: ");
            String playerChoice = scanner.nextLine();

            if (playerChoice.equalsIgnoreCase("quit")) {
                break;
            }

            if (!playerChoice.equalsIgnoreCase("Rock") && !playerChoice.equalsIgnoreCase("Paper")
                    && !playerChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
                continue;
            }

            int computerChoiceIndex = (int) (Math.random() * 3);
            String computerChoice = options[computerChoiceIndex];

            System.out.println("Computer chose: " + computerChoice);

            if (playerChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors"))
                    || (playerChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock"))
                    || (playerChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }
        }

        scanner.close();
    }
}
