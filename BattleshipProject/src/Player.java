import java.util.ArrayList;

public class Player {
	
	//attributes
	private String name;
	private boolean human;
	ArrayList<Ship> ships;
	Grid g;
	private int noOfShips;
	private int gridSize;
	
	//constructors
	public Player(String name, boolean human, int gridSize, int noOfShips) {
		super();
		this.name = name;
		this.human = human;
		this.noOfShips = noOfShips;
		this.gridSize = gridSize;
		ships = new ArrayList<Ship>(noOfShips);
		g = new Grid(gridSize);
	}

	//methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHuman() {
		return human;
	}

	public void setHuman(boolean human) {
		this.human = human;
	}
	
	public int getNoOfShips() {
		return noOfShips;
	}

	public void setNoOfShips(int noOfShips) {
		this.noOfShips = noOfShips;
	}

	public int getGridSize() {
		return gridSize;
	}

	public void setGridSize(int gridSize) {
		this.gridSize = gridSize;
	}

	public void addShip(Ship s){
		ships.add(s);
	}
	
	public void removeShip(Ship s){
		ships.remove(s);
	}
	
	public void addGrid(int size){
		g = new Grid(size);
	}
	
}
