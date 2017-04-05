/**
 * @author Richard Huang
 */
public class SilverCustomer extends Customer{
	/**
	 * Creates a silver customer with the given name, silver member type, a service discount rate of 10%
	 * @param n name of the customer
	 */
    public SilverCustomer(String n){
        super(n);
        memberType="Silver";
        SERVICE_DISCOUNT_RATE=.1;
    }
}