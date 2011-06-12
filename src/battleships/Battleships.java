package battleships;

import java.io.IOException;

/**
 *
 * @author Olly
 */
public class Battleships
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws IOException
	{
	//	System.out.println("Would you like to play a game? y/n");
	//	if ((char)System.in.read() == 'y'){
		Board	board = new	Board();
		GraphicsManager GM = new GraphicsManager();
		GM.PrintOpponentBoard(board);
		GameplayManager GPM = new GameplayManager();
		Ship battleship = new Ship("Battleship"); 
	//	}
	
	}
	
}
