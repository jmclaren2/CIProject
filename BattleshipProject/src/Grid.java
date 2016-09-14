
public class Grid {
	//attributes
	boolean[][] grid;
	private int size;
	
	//constructors
	public Grid(int size) {
		
		this.size = size;
		grid = new boolean[size][size];
	}
	
	//methods
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	public void placeShip(int x, int y, int boatSize, char orientation){
		if (orientation == 'H'){
			for (int i = y; i < (y+boatSize); i++){
				grid[x][i] = true;
			}
		} else {
			for (int i = x; i < (x+boatSize); i++){
				grid[i][y] = true;
			}
		}
	}
}
