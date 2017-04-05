/**
 * @author Richard Huang
 */
public class RegularCustomer extends Customer{
	/**
	 * Creates a regular customer with the given name, not a member,  a service discount rate of 0%
	 * @param n name of customer
	 */
    public RegularCustomer(String n){
        super(n);
        memberType="Not a member";
        member=false;
        SERVICE_DISCOUNT_RATE=0;
    }
}