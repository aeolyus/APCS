import java.util.*; 
/**
 * @author Richard Huang
 */
public class GameLand{
	private static Random r;
    private int dice1,dice2,pA,pB;
    
    /**
     * Method to create a new Random object and
     * initialize with the give seed
     * @param seed - seed for the random number generator
     */
    public GameLand(int seed){
    	r=new Random(seed);
    }
    /**
     * Method that simulates the roll of two dice
     */
    public void roll(){
        dice1=r.nextInt(6)+1;
        dice2=r.nextInt(6)+1;
    } 
 
    /** Method that runs the game. For each move
     *  print the roll and the players location after the move
     */
    public void moving(){
        int b=1;
    	while((pA<101||pB<101)&&b==1){
    	    //part a
    	    roll();
    	    int nextRoll=dice1+dice2;
    	    System.out.print("Player A rolled a "+nextRoll+" >>> ");
    	    if(gameHelper(nextRoll)==1)
    	        System.out.println("** Player A is now at "+pA);
    	    else if(gameHelper(nextRoll)==2){
    	        if(pA-7>=0){
    	            pA-=7;
    	            System.out.println("******* Player A is now at "+pA);
    	        }
    	        else{
    	            pA=0;
    	            System.out.println("******* Player A is now at "+pA);
    	        }
    	    }else if(gameHelper(nextRoll)==0){
    	        pA+=nextRoll;
    	        if(pA==pB){//bump
        	        pB=0;
        	        System.out.println("- BUMPED - Player A is now at "+pA);
        	    }else if(pA>=101){
                    System.out.println("Player A WINS!!!");//a gets more exclamation marks (3)
                    b=-1;
                    System.out.println("Player A is now at "+pA);
                    System.out.println("Player B is now at "+pB);
    	        }else 
    	            System.out.println("Player A is now at "+pA);
    	    }
    	    
    	    //part b
    	    if(b==1){//make sure game hasn't ended yet
                roll();
                nextRoll=dice1+dice2;
                System.out.print("Player B rolled a "+nextRoll+" >>> ");
                if(gameHelper(nextRoll)==1)
                    System.out.println("** Player B is now at "+pB);
                else if(gameHelper(nextRoll)==2){
                    if(pB-7>=0){
                        pB-=7;
                        System.out.println("******* Player B is now at "+pB);
                    }
                    else{
                        pA=0;
                        System.out.println("******* Player B is now at "+pB);
                    }
                }else if(gameHelper(nextRoll)==0){
                    pB+=nextRoll;
                    if(pB==pA){//bump
                        pA=0;
                        System.out.println("- BUMPED - Player B is now at "+pB);
                    }else if(pB>=101){
                        System.out.println("Player B WINS!!");//b gets less exclamation marks (2)
                        b=-1;
                        System.out.println("Player A is now at "+pA);
                        System.out.println("Player B is now at "+pB);
                    }else
                        System.out.println("Player B is now at "+pB);
                }
    	    }
    	}
    }
    
    private int gameHelper(int i){
        if(i==2||i==12)
            return 1;//lose a turn don't move
        else if(i==7)
            return 2;//move back 7
        else
            return 0;//everything's green captain
    }
}