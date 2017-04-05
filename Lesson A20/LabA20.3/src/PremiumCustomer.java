/**
 * @author Richard Huang
 */
public class PremiumCustomer extends Customer{
	/**
	 * Creates a premium customer with the given name, premium member type, service discount rate of 20%
	 * @param n customer name
	 */
    public PremiumCustomer(String n){
        super(n);
        memberType="Premium";
        SERVICE_DISCOUNT_RATE=.2;
    }
}