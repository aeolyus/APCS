public class SilverCustomer extends Customer{
    public SilverCustomer(String n){
        super(n);
        memberType="silver";
        serviceDiscountRate=.1;
    }

	@Override
	public String toString(){
		// TODO Auto-generated method stub
		return null;
	}
}