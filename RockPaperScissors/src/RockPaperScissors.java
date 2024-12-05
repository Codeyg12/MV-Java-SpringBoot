import java.util.Scanner;

public class RockPaperScissors {
  public static void main(String[] args) {
    String[] options = {"rock", "paper", "scissors"};
    int randomNum = (int) Math.floor(Math.random() * 3);
    Scanner in = new Scanner(System.in);
    System.out.println("Please select rock, paper, or scissors: ");

    String input = in.nextLine();
    String player = input.toLowerCase();

    String opponent = options[randomNum];
    String opponentChoice = "Opponent picked: " + opponent;
    System.out.println(opponentChoice);
    if (player.equals(opponent)) {
      System.out.println("It's a tie!");
    } else if (player.equals("rock") && opponent.equals("scissors") || player.equals("paper") && opponent.equals("rock") || player.equals(
        "scissors") && opponent.equals("paper")) {
      System.out.println("Congratulations! You win!");
    } else if (player.equals("scissors") && opponent.equals("rock") || player.equals("rock") && opponent.equals("paper") || player.equals(
        "paper") && opponent.equals("scissors")) {
      System.out.println("Oh no! You lost!");
    } else {
      System.out.println("Invalid input");
    }
  }
}


