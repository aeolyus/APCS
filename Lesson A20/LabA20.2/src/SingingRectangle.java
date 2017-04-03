public class SingingRectangle extends Rectangle{
    public SingingRectangle(int i,int j){
        super(i,j);
    }
    public String toString(){
        String s=super.toString();
        s+="Rectangle song:\nI'm a rectangle.\nYou can see.\nI have four sides.\nCount with me\n2 are short and 2 are long.\nCome along and sing my song.\n";
        return s;
    }
}