import java.util.Scanner;


public class GameLandDriver {
	public static void main(String[] args)
    {        
		Scanner sc = new Scanner(System.in);
		System.out.print("Round 1: Enter the seed: ");
		int seed = sc.nextInt();
        	GameLand game = new GameLand(seed);
    		game.moving();
    		System.out.print("Round 2: Enter the seed: ");
		seed = sc.nextInt();
        	game = new GameLand(seed);
    		game.moving();
    }
}