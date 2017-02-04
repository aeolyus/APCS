import java.util.*;
/**
 * @author Richard Huang
 */
public class TokenPass{ 
    private int[] board; 
    private int currentPlayer; 
    private Random r;

    /** 
     * Print the current game board in the format [#, #, #,. . . ] 
     */ 
    private void printCurrentBoard(){
        String s="[";
        for(int i=0;i<board.length;i++){
            s+=board[i]+", ";
        }
        System.out.println(s.substring(0,s.length()-2)+"]");
    } ;

    /** 
     * Creates the board array to be of size playerCount and fills 
     * it with random integer values from 1 to 10, inclusive. 
     * Initializes currentPlayer to a random integer value in the 
     * range between 0 and playerCount-1, inclusive. The method also 
     * prints the player count, current player, and the initial board 
     * @param playerCount - the number of players 
     * @param seed - seed for the random number generator 
     */ 
    public TokenPass(int playerCount, int seed){
        r=new Random(seed);
        board=new int[playerCount];
        for(int i=0;i<playerCount;i++)
            board[i]=r.nextInt(10)+1;
        currentPlayer=r.nextInt(playerCount);
        System.out.print("Player count = "+playerCount+"\nCurrent player = "+currentPlayer+"\nInitial Board: ");
        printCurrentBoard();
    } 

    /** 
     * Distributes the tokens from the current player's position one 
     * at a time to each player in the game. Distribution begins with 
     * the next position and continues until all the tokens have been 
     * distributed. If there are still tokens to distribute when the 
     * player at the highest position is reached, the next token will 
     * be distributed to the player at position 0. The method also 
     * prints the board after the tokens are distributed. 
     * Precondition: the current player has at least one token. 
     * Postcondition: the current player has not changed. 
     */ 
    public void distributeCurrentPlayerTokens(){
        int temp=board[currentPlayer];
        board[currentPlayer]=0;
        int i=currentPlayer+1;
        for(int k=temp;k>0;k--){
            if((i)<board.length)
                board[i++]++;
            else{
                i=0%1;//why modulus required
                board[i++]++;
            }
            
         }
         System.out.print("After Distributing Tokens: ");printCurrentBoard();
     } 
}