
public class Van extends Vehicle {
	
	//attributes
	private boolean sideDoors;

	//constructors
	public Van(int vID, String regNo, String make, String model,
			int engineSize, char fuelType, boolean sideDoors) {
		super(vID, regNo, "Van", make, model, engineSize, fuelType);
		// TODO Auto-generated constructor stub
	}

	//methods
	public boolean isSideDoors() {
		return sideDoors;
	}

	public void setSideDoors(boolean sideDoors) {
		this.sideDoors = sideDoors;
	}

}
