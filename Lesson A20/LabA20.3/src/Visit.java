import java.util.Date;
/**
 * @author Richard Huang
 */
public class Visit{
	private Customer customer;
	private Date date;
	private double serviceExpense;//after discount
	private double productExpense;//after discount
	/**
	 * Creates a visit of the customer
	 * @param c customer
	 * @param d date of visit
	 * @param sExpense service expense before discount
	 * @param pExpense product expense before discount
	 */
	public Visit(Customer c, Date d, double sExpense, double pExpense){
		customer=c;
		date=d;
		serviceExpense=sExpense*(1-customer.getServiceDiscountRate());
		productExpense=pExpense*(1-customer.getProductDiscountRate());
	}
	/**
	 * Sets the service expense
	 * @param sExpense service expense before discount
	 */
	public void setServiceExpense(double sExpense){
		serviceExpense=sExpense*(1-customer.getServiceDiscountRate());
	}
	/**
	 * Gets the service expense after discount
	 * @return service expense after discount
	 */
	public double getServiceExpense(){
		return serviceExpense;
	}
	/**
	 * Sets the product expense
	 * @param pExpense product expense before discount
	 */
	public void setProductExpense(double pExpense){
		productExpense=pExpense*(1-customer.getProductDiscountRate());
	}
	/**
	 * Returns the product expense after discount
	 * @return product expense after discount
	 */
	public double getProductExpense(){
		return productExpense;
	}
	/**
	 * Returns the total expense after discounts
	 * @return total expense after discounts
	 */
	public double getTotalExpense(){
		return serviceExpense+productExpense;
	}
	/**
	 * Returns the visit as a cool formatted String
	 */
	public String toString(){
		String temp="Date: "+date.toString()+"\n";
		temp+="Invoice for customer: "+customer.getName();
		temp+="\nMembership type: "+customer.getMemberType();
		temp+=String.format("\nService charge (with %.1f%% discount): $%.2f",customer.getServiceDiscountRate()*100,serviceExpense);
		temp+=String.format("\nProduct charge (with %.1f%% discount): $%.2f\n",customer.getProductDiscountRate()*100,productExpense);
		temp+=String.format("Total: $%.2f\n",getTotalExpense());
		return temp;
	}
}
