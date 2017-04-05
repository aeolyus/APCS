/**
 * @author Richard Huang
 */
public class GoldCustomer extends Customer{
	final double SERVICE_DISCOUNT_RATE = 0.15;
    public GoldCustomer(String n){
        super(n);
        memberType="gold";
    }
}