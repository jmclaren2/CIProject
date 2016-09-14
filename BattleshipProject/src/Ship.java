
public abstract class Ship {
	//attributes
	String shipType;
	int length;
	
	//constructors
	public Ship(String shipType, int length) {
		super();
		this.shipType = shipType;
		this.length = length;
	}
	
	//methods
	public String getShipType() {
		return shipType;
	}

	public void setShipType(String shipType) {
		this.shipType = shipType;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	

}
