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
		sExpense=serviceExpense;
		pExpense=productExpense;
	}
	public void setServiceExpense(double sExpense){
		serviceExpense=sExpense;
	}
	public double getServiceExpense(){
		return serviceExpense;
	}
	public void setProductExpense(double pExpense){
		productExpense=pExpense;
	}
	public double getProductExpense(){
		return productExpense;
	}
	public double getTotalExpense(){
		return serviceExpense+productExpense;
	}
	public String toString(){
		return customer.toString();
	}
}
