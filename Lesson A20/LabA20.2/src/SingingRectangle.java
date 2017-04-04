/**
 * @author Richard Huang
 */
public class SingingRectangle extends Rectangle{
	/**
	 * Creates a rectangle with the given dimensions
	 * @param i length
	 * @param j width
	 */
    public SingingRectangle(int i,int j){
        super(i,j);
    }
    /**
     * Returns the dimension, perimenter, and area of the rectangle along with a song
     */
    @Override
    public String toString(){
        String s=super.toString();
        s+="Rectangle song:\n   I'm a rectangle.\n   You can see.\n   I have four sides.\n   Count with me\n   2 are short and 2 are long.\n   Come along and sing my song.\n";
        return s;
    }
}