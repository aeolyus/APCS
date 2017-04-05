/**
 * @author Richard Huang
 */
public class PremiumCustomer extends Customer{
	final double SERVICE_DISCOUNT_RATE = 0.2;
    public PremiumCustomer(String n){
        super(n);
        memberType="premium";
    }
}