/**
 * @author Richard Huang
 */
public class GoldCustomer extends Customer{
    public GoldCustomer(String n){
        super(n);
        memberType="Gold";
        SERVICE_DISCOUNT_RATE=.15;
    }
}