/**
 * @author Richard Huang
 */
public class GoldCustomer extends Customer{
	/**
	 * Creates a gold customer with the given name, gold member type, service discount rate of 15%
	 * @param n name of the customer
	 */
    public GoldCustomer(String n){
        super(n);
        memberType="Gold";
        SERVICE_DISCOUNT_RATE=.15;
    }
}