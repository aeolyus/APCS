public abstract class Customer{
    private String name;
	protected String memberType;
    private boolean member;
    protected double serviceDiscountRate;
    private double PRODUCT_DISCOUNT_RATE=.1;
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
    public double getProducDiscountRate(){
        return PRODUCT_DISCOUNT_RATE;
    }
    public double getProductDiscount(double price){
        return price*PRODUCT_DISCOUNT_RATE;
    }
    public double getServiceDiscountRate(){
        return serviceDiscountRate;
    }
    public double getServiceDiscount(double price){
        return price*serviceDiscountRate;
    }
    public abstract String toString();
}