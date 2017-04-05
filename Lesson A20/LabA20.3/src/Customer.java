/**
 * @author Richard Huang
 */
public abstract class Customer{
    private String name;
    protected boolean member=true;
	protected String memberType="";
	protected double SERVICE_DISCOUNT_RATE;
    private final double PRODUCT_DISCOUNT_RATE=.1;
    /**
     * Creates a customer with the given name
     * @param n name of the customer
     */
    public Customer(String n){
        name=n;
    }
    /**
     * Returns the name of the customer
     * @return name of the customer
     */
    public String getName(){
        return name;
    }
    /**
     * Returns whether the customer is a member
     * @return whether the customer is a member
     */
    public boolean isMember(){
        return member;
    }
    /**
     * Sets whether the customer is a member
     * @param b whether the customer is a member
     */
    public void setMember(boolean b){
        member=b;
    }
    /**
     * Returns the member type
     * @return member type
     */
    public String getMemberType(){
        return memberType;
    }
    /**
     * Sets the member type
     * @param t member type
     */
    public void setMemberType(String t){
        memberType=t;
    }
    /**
     * Returns the product discount rate
     * @return product discount rate
     */
    public double getProductDiscountRate(){
        return PRODUCT_DISCOUNT_RATE;
    }
    /**
     * Returns the discount on the product
     * @param price price of the product
     * @return amount discounted from the price
     */
    public double getProductDiscount(double price){
        return price*PRODUCT_DISCOUNT_RATE;
    }
    /**
     * Returns the service discount rate
     * @return service discount rate
     */
    public double getServiceDiscountRate(){
        return SERVICE_DISCOUNT_RATE;
    }
    /**
     * Returns the discount on the service
     * @param price price of the service
     * @return amount discounted from the service
     */
    public double getServiceDiscount(double price){
        return price*SERVICE_DISCOUNT_RATE;
    }
    /**
     * Returns the customer as a string
     */
    public String toString(){
    	String temp="customer: "+name;
    	temp+="\nMembership type: "+memberType+"\n";
    	return temp;
    }
}