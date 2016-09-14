
public abstract class Vehicle {
	//attributes
	private int vID;
	private String regNo;
	private String vehicleType;
	private String make;
	private String model;
	private int engineSize;
	private char fuelType;
		
	//constructors
	public Vehicle(int vID, String regNo, String vehicleType, String make, String model,
			int engineSize, char fuelType) {
		super();
		this.vID = vID;
		this.regNo = regNo;
		this.vehicleType = vehicleType;
		this.make = make;
		this.model = model;
		this.engineSize = engineSize;
		this.fuelType = fuelType;
	}
	
	//methods
	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public int getvID() {
		return vID;
	}

	public void setvID(int vID) {
		this.vID = vID;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(int engineSize) {
		this.engineSize = engineSize;
	}

	public char getFuelType() {
		return fuelType;
	}

	public void setFuelType(char fuelType) {
		this.fuelType = fuelType;
	}
	

}
