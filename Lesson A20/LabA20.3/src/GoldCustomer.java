public class GoldCustomer extends Customer{
    public GoldCustomer(String n){
        super(n);
        memberType="gold";
        serviceDiscountRate=.15;
    }

	@Override
	public String toString(){
		// TODO Auto-generated method stub
		return null;
	}
}