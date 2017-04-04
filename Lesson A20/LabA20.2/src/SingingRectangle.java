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
        s+="Rectangle song:\nI'm a rectangle.\nYou can see.\nI have four sides.\nCount with me\n2 are short and 2 are long.\nCome along and sing my song.\n";
        return s;
    }
}