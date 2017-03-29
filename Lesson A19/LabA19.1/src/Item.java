/**
 * @author Richard Huang
 */
public class Item{
    private int id,inv;//item id and inventory number
    /**
     * Constructor for an item with a given id and inventory number
     * @param i id
     * @param j inventory number
     */
    public Item(int i,int j){
        id=i;
        inv=j;
    }
    /**
     * Returns the id of the item
     * @return item id
     */
    public int getId(){
        return id;
    }
    /**
     * Returns the inventory number of the item
     * @return inventory number
     */
    public int getInv(){
        return inv;
    }
    /**
     * Compares the item to another item using their id
     * @param other item to be compared to
     * @return difference in id
     */
    public int compareTo(Item other){
        return id-other.getId();
    }
    /**
     * Checks to see if an item has the same id
     * @param other item to be compared to
     * @return boolean based on whether the items have the same id
     */
    public boolean equals(Item other){
        return id==other.getId();
    }
    /**
     * Prints the item's id and inventory number
     */
    public String toString(){
        return getId()+"   "+getInv();
    }
}