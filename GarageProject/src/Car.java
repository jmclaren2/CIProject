
public class Car extends Vehicle {
	
	//attributes
	private int noOfDoors;
	private boolean convertable;

	//constructors
	public Car(int vID, String regNo, String make, String model,
			int engineSize, char fuelType, int noOfDoors, boolean convertable) {
		super(vID, regNo, "Car" , make, model, engineSize, fuelType);
		// TODO Auto-generated constructor stub
		this.noOfDoors = noOfDoors;
	}
	
	//methods 
	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	public boolean isConvertable() {
		return convertable;
	}

	public void setConvertable(boolean convertable) {
		this.convertable = convertable;
	}
	
}
