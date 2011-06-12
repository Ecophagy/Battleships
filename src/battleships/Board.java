/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package battleships;

/**
 * Class for the Board
 * @author Olly
 */
public class Board
{
	/**
	 * Size of square board
	 */
	private int size;
	/**
	 * Array representing Board
	 * String gives status - H = hit, M = miss or U = unused
	 * 
	 */
	char[][] grid;
	/**
	 * Default constructor - size of 10
	 */
	public Board(){
		this.size = 10;
		System.out.println(size + "x" + size + " Board Created");
		this.grid = new char[size+1][size+1];
		for(int i = 0; i <= size; i++){
			grid[i][i] = 'U';
		}
	}
	/**
	 * Constructor for custome board size
	 * Not properly implmented yet
	 * @param size Length of edge
	 */
	public Board(int size){
		this.size = size;
		System.out.println(size + "x" + size + " Board Created");
	}
	/**
	 * Gets the Size of the Board
	 * @return The size of the Board
	 */
	public int GetSize(){
		return size;
	}
	/**
	 * Gets the Grid
	 * @return The Grid
	 */
	public char GetGrid(int i, int j){
		return grid[i][i];
	}
	
	public void SetGrid(int column, char row, char action){
		int label = row - 'A';
		grid[column][label] = action;
	}
}
