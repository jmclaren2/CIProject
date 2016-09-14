import java.util.ArrayList;
import java.util.Scanner;


public class Game {
	//attributes
	ArrayList<Player> players;
	private int noOfPlayers;
	private final int GRIDSIZE = 12;
	
	//constructors
	public Game(int noOfPlayers){
		this.noOfPlayers = noOfPlayers;
		players = new ArrayList<Player>(noOfPlayers);
	}
	
	//methods
	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
	 
	public void addPlayer(Player p){
		players.add(p);
	}

	public boolean shotFired(Player p, Grid g, int x, int y){
		
		if (p.g.grid[x][y] == true){
			return true;
		} else
			return false;
	}
	
	public void setUp(Game game1){
		//add players
		game1.addPlayer(new Player("Player1", true, GRIDSIZE, 7));
		game1.addPlayer(new Player("Player2", true, GRIDSIZE, 7));
		
		//add ships to game (loop through first player and all required ships)
		for (int i = 0; i < 2; i++){
			for (int j = 0; j < 2; i++){	//two patrol boats
				game1.players.get(i).ships.add((Ship) new PatrolBoat(j)); 
			}
			for (int j = 0; j < 2; i++){	//two battleships
				game1.players.get(i).ships.add((Ship) new Battleship(j));
			}
			game1.players.get(i).ships.add((Ship) new Submarine());
			game1.players.get(i).ships.add((Ship) new Destroyer());
			game1.players.get(i).ships.add((Ship) new Carrier());
		}
		
		//loop through all ships to be placed on grid
		int xCoOrd, yCoOrd;
		char orientation;
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 7; i++){
				
				//get orientation of ship
				orientation = getOrientation(game1, i, j);
				
				//get coordinates
				xCoOrd = getCoOrd(game1, i, j, "x");
				yCoOrd = getCoOrd(game1, i, j, "y");
				
				//checking there isn't already a ship at coordinates
				if(orientation == 'V'){
					for(int k = xCoOrd; k < (xCoOrd + game1.players.get(i).ships.get(j).length); k++){
						while(game1.players.get(i).g.grid[k][yCoOrd]){
							xCoOrd = getCoOrd(game1, i, j, "x");					
						}
					}
				} else {
					for(int k = yCoOrd; k < (yCoOrd + game1.players.get(i).ships.get(j).length); k++){
						while(game1.players.get(i).g.grid[xCoOrd][k]){
							xCoOrd = getCoOrd(game1, i, j, "x");					
						}
					}
				}
				
				//game1.players.get(i).g.placeShip(xCoOrd, yCoOrd, game1.players.get(i).ships.get(j).length, orientation);
			}
		}
		
		//player 1 place ship on grid
		game1.players.get(0).g.placeShip(0, 0, 
				game1.players.get(0).ships.get(0).length, 'H');
		
		//player 2 place ship on grid
		game1.players.get(1).g.placeShip(0, 0, 
				game1.players.get(1).ships.get(0).length, 'H');
	}
	
	private char getOrientation(Game g, int i, int j){
		//ensures orientation is set to either V or H
		Scanner in = new Scanner(System.in);
		System.out.println("Do you want to place your " + 
				g.players.get(i).ships.get(j).getShipType() + " horizontal or vertical? "
						+ "(Enter 'H' or 'V')?");
		char o = in.nextLine().charAt(0);
		while (o != 'H' || o != 'V'){
			System.out.println("Invalid orientation enter 'H' or 'V': ");
			o = in.nextLine().charAt(0);
		}
		in.close();
		return o;
	}
	
	private int getCoOrd(Game g, int i, int j, String coOrd){
		//ensures coordinates are within GRIDSIZE
		Scanner in = new Scanner(System.in);
		System.out.println("Enter " + coOrd + " coordinate to place your " + 
				g.players.get(i).ships.get(j).getShipType() + ":");
		int c = in.nextInt();
		while (c > (GRIDSIZE-1) || c < 0){
			System.out.println("Invalid coordinate grid size is " + GRIDSIZE + "\n Re-enter " +
					coOrd + " coordinate:");
			c = in.nextInt();
		}
		
		in.close();
		return c;
		
	}

}

















