/**
 * @author Richard Huang
 */
public class RegularCustomer extends Customer{
    public RegularCustomer(String n){
        super(n);
        memberType="Not a member";
        member=false;
        SERVICE_DISCOUNT_RATE=0;
    }
}