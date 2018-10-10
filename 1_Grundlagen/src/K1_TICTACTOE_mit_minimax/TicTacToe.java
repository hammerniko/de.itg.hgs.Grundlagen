package K1_TICTACTOE_mit_minimax;
import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {
        Board b = new Board();
        Random rand = new Random();
        
        b.displayBoard();

        System.out.println("Wer spielt als erster? (1)Computer (2)User: ");
        int choice = b.scan.nextInt();
        if(choice == 1){
            Point p = new Point(rand.nextInt(3), rand.nextInt(3));
            b.placeAMove(p, 1);
            b.displayBoard();
        }
        
        while (!b.isGameOver()) {
            System.out.println("Dein Zug: ");
            Point userMove = new Point(b.scan.nextInt(), b.scan.nextInt());

            b.placeAMove(userMove, 2); //2 for O and O is the user
            b.displayBoard();
            if (b.isGameOver()) {
                break;
            } 
            b.callMinimax(0, 1);
            for (PointsAndScores pas : b.rootsChildrenScores) {
                System.out.println("Point: " + pas.point + " Score: " + pas.score);
            }
            b.placeAMove(b.returnBestMove(), 1);
            b.displayBoard();
        }
        if (b.hasXWon()) {
            System.out.println("Unfortunately, you lost!");
        } else if (b.hasOWon()) {
            System.out.println("You win! This is not going to get printed.");
        } else {
            System.out.println("It's a draw!");
        }
    }
}