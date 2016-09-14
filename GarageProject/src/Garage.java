import java.text.DecimalFormat;
import java.util.ArrayList;


public class Garage {
	
	//attributes
	ArrayList<Vehicle> garage;
	private final double BASERATE = 10.99;
	private String name;
	private DecimalFormat df = new DecimalFormat("#.##");
	
	//constructors
	public Garage(String name) {
		super();
		this.name = name;
		garage = new ArrayList<Vehicle>();
		
	}

	//methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addVehicle(Vehicle v){
		//add vehicle to garage
		garage.add(v);
	}
	
	public void removeVehicle(Vehicle v) {
		//remove vehicle from garage
		garage.remove(v);
	}
	
	
	public double calculateBill(Vehicle v, int hrs){
		//calculates bill based on type of vehicle
		double multiplyer = 1;
		if (v.getFuelType() == 'D'){
			multiplyer += 0.2;
		}
		if (v.getEngineSize() > 1795){
			multiplyer += 0.5;
		}
		if (v.getVehicleType() == "Car"){
			multiplyer += 0.8;
			Car c = (Car) v ;
			if(c.getNoOfDoors() == 5 || c.getNoOfDoors() == 4){
				multiplyer +=0.2;
			}
			if(c.isConvertable()){
				multiplyer += 0.2;
			}
		} else if (v.getVehicleType() == "Van"){
			multiplyer += 1.3;
			Van van = (Van) v;
			if (van.isSideDoors()){
				multiplyer +=0.3;
			}
		} else if (v.getVehicleType().equalsIgnoreCase("Motorbike")){
			multiplyer += 0.5;
			Motorbike m = (Motorbike) v;
			if (m.getFrameSize() > 150){
				multiplyer += 0.4;
			}
		}
		
		return (multiplyer*BASERATE*hrs);
	}
	
	public String vehicleDetails(Car c, int hrs){
		StringBuilder sb = new StringBuilder();
		sb.append("ID: " + c.getvID() + " \n");
		sb.append("Reg: " + c.getRegNo() + " \n");
		sb.append("Name: " + c.getMake() + " " + c.getModel() + " \n");
		sb.append("Bill: £" + df.format(calculateBill(c, hrs)) + " \n");
		
		return sb.toString();
	}
	
	public String vehicleDetails(Van v, int hrs){
		StringBuilder sb = new StringBuilder();
		sb.append("ID: " + v.getvID() + " \n");
		sb.append("Reg: " + v.getRegNo() + " \n");
		sb.append("Name: " + v.getMake() + " " + v.getModel() + " \n");
		sb.append("Bill: £" + df.format(calculateBill(v, hrs)) + " \n");
		
		return sb.toString();
	}
	
	public String vehicleDetails(Motorbike m, int hrs){
		StringBuilder sb = new StringBuilder();
		sb.append("ID: " + m.getvID() + " \n");
		sb.append("Reg: " + m.getRegNo() + " \n");
		sb.append("Name: " + m.getMake() + " " + m.getModel() + " \n");
		sb.append("Bill: £" + df.format(calculateBill(m, hrs)) + " \n");
		
		return sb.toString();
	}
	
	public void emptyGarage(){
		garage.clear();
	}
	
	

}
