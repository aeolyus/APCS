/**
 * @author Richard Huang
 */
public class Product {

	private static String companyName;//initializes private static variable for company name
	private String name;//initializes String variable name
	private double cost, unitPrice, discount, unitSalePrice;//initializes cost, unitPrice, discount, and unitSalePrice as doubles
	private int quantitySold;//initializes quantitySold as an integer
	
	//default constructor
	public Product(){
		name="";
		cost=unitPrice=discount=unitSalePrice=quantitySold=0;
	}
	
	//constructor for product with discount
	public Product(String myName, double myCost, double myUnitPrice, double myDiscount, int myQuantitySold){
		name=myName;
		cost=myCost;
		unitPrice=myUnitPrice;
		discount=myDiscount;
		quantitySold=myQuantitySold;
		unitSalePrice=calculateSalePrice();
	}
	
	//constructor for product without discount
	public Product(String myName, double myCost, double myUnitPrice, int myQuantitySold){
		name=myName;
		cost=myCost;
		unitSalePrice=unitPrice=myUnitPrice;
		discount=0;
		quantitySold=myQuantitySold;
		
	}
	
	//calculates sale price based on unitPrice and discount
	private double calculateSalePrice(){
		return unitPrice-unitPrice*(discount/100);
	}
	
	//sets product name
	public void setName(String myName) {
		name=myName;
	}

	//sets product cost
	public void setCost(double myCost) {
		cost=myCost;
	}

	//sets product price
	public void setPrice(double myUnitPrice) {
		unitPrice=myUnitPrice;
	}

	//sets product discount
	public void setDiscount(double myDiscount) {
		discount=myDiscount;
	}

	//sets quantity sold
	public void setQuantitySold(int myQuantity) {
		quantitySold=myQuantity;
	}

	//sets company name
	public void setCompany(String myCName) {
		companyName=myCName;
	}

	//returns product name
	public String getName() {
		return name;
	}

	//return product cost
	public double getCost() {
		return cost;
	}

	//returns product cost
	public double getPrice() {
		return unitPrice;
	}

	//returns product discount
	public double getDiscount() {
		return discount;
	}

	//returns product sale price
	public double getSalePrice() {
		return unitSalePrice=calculateSalePrice();
	}

	//returns number of products sold
	public int getQuantitySold() {
		return quantitySold;
	}

	//returns company name
	public String getCompanyName() {
		return companyName;
	}
	
	//returns profit earned for each unit
	private double unitProfit() {
		return unitSalePrice-cost;
	}

	//returns total profit earned
	public double totalProfit() {
		return unitProfit()*quantitySold;
	}

	//fancy method to print object attributes as a string
	public String toString() {
		String s;
		s = companyName + "\n";
		s += "------------------------------------------------------\n";
		s += String.format("%s: \nCost           = $%8.2f\n", name, getCost());
		s += String.format("Price          = $%8.2f\n", getPrice());
		s += String.format("Discount       = %8.2f%s", getDiscount(), "%\n");
		s += String.format("Sale Price     = $%8.2f\n", getSalePrice());
		s += String.format("Quantity Sold  = $%8d\n", getQuantitySold());
		s += String.format("Profit/unit    = $%8.2f\n", unitProfit());
		s += String.format("Total Profit   = $%8.2f\n", totalProfit());
		return s;
	}
}

