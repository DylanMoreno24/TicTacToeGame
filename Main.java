import java.util.Scanner;

public class Main {
	 public static void main(String[ ] args) {
	 GameModel game = new GameModel( );
	 
	 Scanner input = new Scanner(System.in);
	 for(int k=0; k<9; k++) {
	   System.out.print("Enter X value: ");
	   int x_value = input.nextInt();
	   System.out.print("Enter Y value: ");
	   int y_value = input.nextInt();
	
	   game.putMark(x_value, y_value);
	   System.out.print(game);
	 }
	 
	 System.out.println(game);
	 int winningPlayer = game.winner( );
	 String[ ] outcome = {"O wins", "Tie", "X wins"}; // rely on ordering
	 System.out.println(outcome[1 + winningPlayer]);
	 }
}
