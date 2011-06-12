package battleships;

/**
 * Class dealing with graphical representation of the game
 * @author Olly
 */
public class GraphicsManager
{		
	/**
	 * ASCII characters for representing Sea and Ships
	 */
	final static char SHIP = '\u00FE';
	final static char SEA = '\u00B1';
	
	public GraphicsManager(){
		//nothing
	}
	/**
	 * Prints your view of your opponents board
	 * contains Sea and location of hits and misses
	 * TODO: make the graphics nicer.
	 * @param board 
	 */
	public void PrintOpponentBoard(Board board){
		for(int i = 1; i <= board.GetSize(); i++){
		System.out.print("    " + i);
		}
		System.out.println("");
		for(int i = 0; i <= board.GetSize(); i++){
			char label = (char) ('A' + i);
			System.out.print(label + "   ");
			for(int j = 1; j <= board.GetSize(); j++){
				if(board.GetGrid(i, j) == 'U'){
					System.out.print(SEA + "    ");
				}
				else if(board.GetGrid(i, j) == 'H'){
					System.out.print("X    ");
				}
				else if(board.GetGrid(i, j) == 'M'){
					System.out.print("O    ");
				}
			}
			System.out.println("");
		}
	}
	/**
	 * Prints yor view of your board, including ship location, sea and enemy
	 * hits and misses.
	 * @param board 
	 */
	public void PrintPlayerBoard(Board board){
		//FIXME: Implement me!
	}
}
