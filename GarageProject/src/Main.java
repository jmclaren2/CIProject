public class Main {

	public static void main(String[] args) {
		//create garage
		Garage g = new Garage("Garage1");
		
		//add vehicles
		g.addVehicle(new Car(0, "CAR123", "Renault", "Megane", 2000, 'D', 3, false));
		g.addVehicle(new Car(1, "CAR142", "Renault", "Clio", 1199, 'P', 3, false));
		g.addVehicle(new Van(2, "VAN001", "VW", "CADDY", 2995, 'D', true));
		g.addVehicle(new Motorbike(3, "BIKE321", "Kawasaki", "Bike", 1200, 'P', 100));
		
		//print out details
		System.out.println(g.vehicleDetails((Car)g.garage.get(0), 5));
		System.out.println(g.vehicleDetails((Car)g.garage.get(1), 5));
		System.out.println(g.vehicleDetails((Van)g.garage.get(2), 7));
		System.out.println(g.vehicleDetails((Motorbike)g.garage.get(3), 2));
		
		//no. of cars in garage 
		System.out.println("There are " + g.garage.size() + " vehicles in " + g.getName());
		
		//remove the car
		g.removeVehicle((Car)g.garage.get(0));
		
		//no. of cars in garage again (Checking remove) 
		System.out.println("There are " + g.garage.size() + " vehicles in " + g.getName());
		
		System.out.println(g.vehicleDetails((Van)g.garage.get(1), 7));
		
		//empty the garage
		g.emptyGarage();
		
		//checking there are no vehicles left
		System.out.println("There are " + g.garage.size() + " vehicles in " + g.getName());
	}

}
