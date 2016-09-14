
public class Motorbike extends Vehicle {
	
	//attributes
	private int frameSize;

	//constructors
	public Motorbike(int vID, String regNo, String make,
			String model, int engineSize, char fuelType, int frameSize) {
		super(vID, regNo, "Motorbike", make, model, engineSize, fuelType);
		// TODO Auto-generated constructor stub
		this.frameSize = frameSize;
	}

	
	//methods
	public int getFrameSize() {
		return frameSize;
	}

	public void setFrameSize(int frameSize) {
		this.frameSize = frameSize;
	}

}
