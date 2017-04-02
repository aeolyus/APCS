public class PremiumCustomer extends Customer{
    public PremiumCustomer(String n){
        super(n);
        memberType="premium";
        serviceDiscountRate=.2;
    }

	@Override
	public String toString(){
		// TODO Auto-generated method stub
		return null;
	}
}