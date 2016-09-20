/**
 * Taxes class - class used to calculate the federal, social security and state taxes
 * @author: Richard Huang
 */
public class Taxes{
    private double hoursWorked,hourlyRate;//hours worked and hourly rate
    private final double FEDERAL_TAX=.15,STATE_TAX=.04,FICA_TAX=.0765;//federal, state, and fica tax rates (not in percentage form)
    /**
     * Constructor that takes in hoursWorked and hoursRated
     * @param hWorked Hours worked
     * @param hRate Hourly rate
     */
    public Taxes(double hWorked, double hRate){
        hoursWorked=hWorked;
        hourlyRate=hRate;
    }
    /**
     * Returns hours worked
     * @return Returns double hoursWorked
     */
    public double getHoursWorked(){
        return hoursWorked;
    }
    /**
     * Returns hour rate
     * @return Returns double hourlyRate
     */
    public double getHourlyRate(){
        return hourlyRate;
    }
    /**
     * Returns federal tax rate
     * @return Returns double FEDERAL_TAX
     */
    public double getFedTaxRate(){
        return FEDERAL_TAX;
    } 
    /**
     * Returns social security tax rate
     * @return Returns FICA_TAX
     */
    public double getSocSecurityRate(){
        return FICA_TAX;
    }
    /**
     * Returns state tax rate
     * @return Returns STATE_TAX
     */
    public double getStateTaxRate(){
        return STATE_TAX;
    }
    /**
     * Calculates gross pay (before taxes)
     * @return Returns hoursWorked*hourlyRate
     */
    public double computeGrossPay(){
        return hoursWorked*hourlyRate; 
    }
    /**
     * Calculates federal tax
     * @return Returns grossPay*federalTax
     */
    public double computeFedTax(){
        return computeGrossPay()*FEDERAL_TAX;
    }
    /**
     * Calculates social security tax
     * @return Returns grossPay*FICATax
     */
    public double computeSocSecurity(){
        return computeGrossPay()*FICA_TAX;
    }
    /**
     * Calculates state tax
     * @return Returns grossPay*stateTax
     */
    public double computeStateTax(){
        return computeGrossPay()*STATE_TAX;
    }
    /**
     * Calculates total tax
     * @return Returns fedTax+socSecurityTax+StateTax
     */
    public double computeTotalTax(){
        return computeFedTax()+computeSocSecurity()+computeStateTax();
    }
    /**
     * Calculates net pay (after taxes)
     * @return Returns grossPay-totalTax
     */
    public double computeNetPay(){
        return computeGrossPay()-computeTotalTax();
    }
}