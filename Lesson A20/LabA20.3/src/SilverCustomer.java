/**
 * @author Richard Huang
 */
public class SilverCustomer extends Customer{
	final double SERVICE_DISCOUNT_RATE = 0.1;
    public SilverCustomer(String n){
        super(n);
        memberType="silver";
    }
}