/**
 * @author Richard Huang
 */
public abstract class Customer{
    private String name;
    protected boolean member=true;
	protected String memberType="";
	protected double SERVICE_DISCOUNT_RATE;
    private final double PRODUCT_DISCOUNT_RATE=.1;
    public Customer(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public boolean isMember(){
        return member;
    }
    public boolean setMember(boolean b){
        member=b;
        return member;
    }
    public String getMemberType(){
        return memberType;
    }
    public void setMemberType(String t){
        memberType=t;
    }
    public double getProductDiscountRate(){
        return PRODUCT_DISCOUNT_RATE;
    }
    public double getProductDiscount(double price){
        return price*PRODUCT_DISCOUNT_RATE;
    }
    public double getServiceDiscountRate(){
        return SERVICE_DISCOUNT_RATE;
    }
    public double getServiceDiscount(double price){
        return price*SERVICE_DISCOUNT_RATE;
    }
    public String toString(){
    	String temp="customer: "+name;
    	temp+="\nMembership type: "+memberType+"\n";
    	return temp;
    }
}