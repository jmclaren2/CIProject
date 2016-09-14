import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//get number of players
		System.out.println("How many players?");
		int noOfPlayers = in.nextInt();
		while (noOfPlayers < 1 || noOfPlayers > 2){
			System.out.println("Invalid number of players (1 or 2 player(s))");
			noOfPlayers = in.nextInt();
		}
		
		//create new game with noOfPlayers players
		Game game1 = new Game(noOfPlayers);
		game1.setUp(game1);
		
		//player1 first shot
		if (game1.shotFired(game1.players.get(1), game1.players.get(1).g, 1, 0)){
			System.out.println("Boat Hit!!");
		} else {
			System.out.println("Missile Missed");
		}
	
		in.close();
	}

}
