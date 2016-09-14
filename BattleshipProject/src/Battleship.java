
public class Battleship extends Ship {
	//attributes
	private int id;
	
	//constructors
	public Battleship(int id) {
		super("Battleship", 3);

		this.id = id;
	}

	//methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
