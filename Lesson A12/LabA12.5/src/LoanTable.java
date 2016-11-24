/**
 * @author Richard Huang
 */
public class LoanTable{
    private double principal,lowR,highR;
    int years;
    /**
	 * Constructor
	 * @param APrincipal principal amount borrowed
	 * @param AYears number of years for the loan to be paid off
	 * @param ALowR low interest rate
	 * @param AHighR high interest rate
	 */
    public LoanTable(double aPrincipal,int aYears,double aLowR,double aHighR){
        principal=aPrincipal;
        lowR=aLowR;
        highR=aHighR;
        years=aYears;
    }
    /**
     * Calculates the monthly payment
     * @param k princpal amount borrowed
     * @return monthly payment
     */
    private double calculatePayment(double k){
        k/=1200.0;
        double c=Math.pow(1+k,12*years);
        return (principal*k*c)/(double)(c-1);
    }
	/**
	 * Method to print the Loan table
	 */
    public void printTable(){
        //formatting principal
        String s=""+principal;
        if(s.substring(s.indexOf(".")).length()<3)
            s+="0";    
//       System.out.println("Principal = $"+s);
//       System.out.println("Time = "+years+" years");
//       System.out.println("Low rate = "+Math.round(highR)+"%");
//       System.out.println("High rate = "+Math.round(lowR)+"%\n");
       System.out.println("Annual Interest Rate  Monthly Payment\n");
       for(;lowR<=highR;lowR+=.25){
           System.out.printf("%15.2f",lowR);
           System.out.printf("%17.2f\n",calculatePayment(lowR));
       }
    }
}