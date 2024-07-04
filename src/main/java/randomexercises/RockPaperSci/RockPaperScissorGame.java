package RockPaperSci;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;


public class RockPaperScissorGame {
    public static final Logger log = Logger.getLogger(String.valueOf(RockPaperScissorGame.class));

    public static final String winStatus = "You win!";
    public static final String loseStatus = "You lose!";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove;

            while (true) {
                System.out.println("Please enter your move (r , p or s)");

                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                log.warning("Try again");

            }

            //logic here computer vs player
            System.out.println("Computer played " + computerMove);
            if (playerMove.equals(computerMove)) { // if playerMove equals to computerMove = it's a tie!
                System.out.println("The game was a tie!");

            } else if (playerMove.equals("r")) { // rock vs paper = paper wins
                if (computerMove.equals("p")) {
                    System.out.println(loseStatus);


                } else if (computerMove.equals("s")) {
                    System.out.println(winStatus);

                }

            } else if (playerMove.equals("p")) {
                if (computerMove.equals("r")) {
                    System.out.println(winStatus);

                } else if (computerMove.equals("s")) {
                    System.out.println(loseStatus);
                }


            } else if (playerMove.equals("s")) {
                if (computerMove.equals("p")) {
                    System.out.println(winStatus);

                } else if (computerMove.equals("r")) {
                    System.out.println(loseStatus);
                }
            }

            System.out.println("Play again? (y/n)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")) {
                break;
            }
        }
        scanner.close();

    }
}
