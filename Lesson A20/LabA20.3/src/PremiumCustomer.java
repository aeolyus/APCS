/**
 * @author Richard Huang
 */
public class PremiumCustomer extends Customer{
    public PremiumCustomer(String n){
        super(n);
        memberType="Premium";
        SERVICE_DISCOUNT_RATE=.2;
    }
}