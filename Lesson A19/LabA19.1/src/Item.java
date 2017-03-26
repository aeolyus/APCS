public class Item{
    private int id,inv;
    public Item(int i,int j){
        id=i;
        inv=j;
    }
    public int getId(){
        return id;
    }
    public int getInv(){
        return inv;
    }
    public int compareTo(Item other){
        return id-other.getId();
    }
    public boolean equals(Item other){
        return id==other.getId();
    }
    public String toString(){
        return getId()+"   "+getInv();
    }
}