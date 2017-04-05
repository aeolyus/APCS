import java.util.Date;
/**
 * @author Richard Huang
 */
public class Visit{
	private Customer customer;
	private Date date;
	private double serviceExpense;//after discount
	private double productExpense;//after discount
	public Visit(Customer c, Date d, double sExpense, double pExpense){
		customer=c;
		date=d;
		serviceExpense=sExpense*(1-customer.getServiceDiscountRate());
		productExpense=pExpense*(1-customer.getProductDiscountRate());
	}
	public void setServiceExpense(double sExpense){
		serviceExpense=sExpense*(1-customer.getServiceDiscountRate());
	}
	public double getServiceExpense(){
		return serviceExpense;
	}
	public void setProductExpense(double pExpense){
		productExpense=pExpense*(1-customer.getProductDiscountRate());
	}
	public double getProductExpense(){
		return productExpense;
	}
	public double getTotalExpense(){
		return serviceExpense+productExpense;
	}
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
