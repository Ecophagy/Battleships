package battleships;

/**
 * Class that deals with ships
 * @author Olly
 */
public class Ship
{
	/**
	 * Length of the ship in grid squares
	 */
	private int size;
	/**
	 * Amount of damage taken
	 * when damage = length, ship is destroyed
	 */
	private int damage;
	/**
	 * Type of ship (battleship, carrier, destroyer etc)
	 */
	private String type;
	/**
	 * Location of starting point on grid
	 * char: E = empty, S = ship, H = hit
	 */
	private char[][] location;
	/**
	 * Default Constructor
	 */
	Ship(){
		//Move along citizen, nothing to see here.
	}
	/**
	 * Constructor for Ships
	 * @param type The type of ship to create
	 */
	Ship(String type){
		if (type.compareTo("Battleship") == 0){
			this.size = 4;
			this.type = type;
		}		
		else if (type.compareTo("Carrier") == 0){
			this.size = 5;
			this.type = type;
		}
		else if (type.compareTo("Cruiser") == 0){
			this.size = 3;
			this.type = type;
		}
		else if (type.compareTo("Submarine") == 0){
			this.size = 3;
			this.type = type;
		}
		else if (type.compareTo("Destroyer") == 0){
			this.size = 2;
			this.type = type;
		}
		else
			System.out.println("Invalid Ship Type");
}
	/**
	 * Sets the location of the ship on the grid
	 * TODO: include out-of-bounds placement checkers
	 * @param column x-axis vaule of placement
	 * @param row	y-axis value of placement
	 * @param direction What diretion the boat is from the placement
	 */
		public void setLocation(int column, char row, char direction){
			int label = row - 'A';
			switch (direction){
				case 'N' :	for(int i = 0; i <= size; i++){
											location[column][label-i] = 'S';
										}
				case 'S' :	for(int i = 0; i <= size; i++){
											location[column][label+i] = 'S';
										}
				case 'E' :	for(int i = 0; i <= size; i++){
											location[column+1][label] = 'S';
										}
				case 'W' :	for(int i = 0; i <= size; i++){
											location[column-i][label] = 'S';
										}
				default : System.out.println("invalid direction");
				}
			}
		}

