/**
 * @author Richard Huang
 */
public class SilverCustomer extends Customer{
    public SilverCustomer(String n){
        super(n);
        memberType="Silver";
        SERVICE_DISCOUNT_RATE=.1;
    }
}