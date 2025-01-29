import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Enter your choice (rock/paper/scissors) or 'quit' to exit:");
         while (true) {
            String userChoice = scanner.nextLine().toLowerCase();
            if (userChoice.equals("quit")) {
                break;
            }
            String computerChoice = getComputerChoice(random);
            System.out.println("Computer chose: " + computerChoice);
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
        }
        scanner.close();
    }
    private static String getComputerChoice(Random random) {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[random.nextInt(choices.length)];
    }
    private static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        }
        switch (userChoice) {
            case "rock":
                if (computerChoice.equals("scissors")) {
                    return "Rock crushes scissors! You win!";
                } else {
                    return "Paper covers rock! You lose!";
                }
            case "paper":
                if (computerChoice.equals("rock")) {
                    return "Paper covers rock! You win!";
                } else {
                    return "Scissors cuts paper! You lose!";
                }
            case "scissors":
                if (computerChoice.equals("paper")) {
                    return "Scissors cuts paper! You win!";
                } else {
                    return "Rock crushes scissors! You lose!";
                }
            default:
                return "Invalid choice!";
        }
    }
}
