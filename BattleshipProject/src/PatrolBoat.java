public class PatrolBoat extends Ship {

	//attributes
	private int id;
	
	//constructors
	public PatrolBoat(int id) {
		super("Patrol Boat", 2);
		
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
