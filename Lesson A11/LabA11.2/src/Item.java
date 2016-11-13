/**
 * Simulates an tem in the grocery store
 * @author Richard Huang
 */
public class Item {
	private String name;
	private double price,discount;
	
	/**
	 * Initializes the item name, price and discount
	 * @param name - item name
	 * @param price - item price in dollars
	 * @param discount - discount in dollars
	 */
	public Item(String name,double price,double discount){
		this.name=name;
		this.price=price;
		this.discount=discount;
	}
	
	/**
	 * Returns the item name
	 * @return item name
	 */
	public String getName(){return name;}
	
	/**
	 * Returns the item price in dollars
	 * @return item price
	 */
	public double getPrice(){return price;}
	
	/**
	 * Returns the item discount in dollars
	 * @return item discount 
	 */
	public double getDiscount(){return discount;}
	
	/**
	 * Returns the value passed as a string in the dollar and cents format ####.##
	 * @param value - value to be converted to dollar and cents format
	 * @return String in dollar and cents format
	 */
	public String valueToString(double value){
		String temp=""+Math.round(value*100)/100.0;
		if(temp.substring(temp.indexOf(".")).length()<3){
			return temp+"0";
		}
		return temp;
	}
	
	/**
	 * Returns a string with item name, price and discount in the format
	 * name item price (-discount). One item will get printed per line.
	 * For example: Spinach $3.98 (-$1.05)
	 */
	public String toString(){
		return getName()+" $"+valueToString(getPrice())+" (-$"+valueToString(getDiscount())+")";	
	}
}
