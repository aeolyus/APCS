/**
 * @author Richard Huang
 */
public class Chocolate{
    /**
	 * Checks if we can make chocolate bars
	 * @param j - number of big bricks
	 * @param i - number of small bricks
	 * @param g - length of chocolate bar
	 * @return - true if we have enough bricks to make a chocolate bar, false otherwise
	 */
    public static boolean canMakeBricks(int i,int j,int g){
        if(numberOfSmallBricksNeeded(i,j,g)>=0)
            return true;
        else
            return false;
    }
    
    /**
	 * Determines number of small bricks needed to make the chocolate bar
	 * @param j - number of big bricks
	 * @param i - number of small bricks
	 * @param g - length of chocolate bar
	 * @return number of small bricks needed
	 */
    public static int numberOfSmallBricksNeeded(int i,int j,int g){
        int smallBricks=g;
        for(;j>0;j--){
            if(smallBricks-5<0)
                break;
            smallBricks-=5;
        }
        if(smallBricks<=i)
            return smallBricks;
        else
            return -1;
    }
}