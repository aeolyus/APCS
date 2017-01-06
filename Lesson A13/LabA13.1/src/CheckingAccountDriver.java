/**
 * @author Richard Huang
 */
public class CheckingAccountDriver{
    public static void main(String args[]){
        try{//tries to make an account with negative balance
            CheckingAccount c1=new CheckingAccount(-1,1);
        }catch(Exception e1){
            System.out.println(e1.getMessage());
            try{//tries to make a checking account and deposit a negative amount
                CheckingAccount c2=new CheckingAccount(1,2);
                c2.deposit(-1);
            }catch(Exception e2){
                System.out.println(e2.getMessage());
                try{//makes a checking account and tries to overdraw
                    CheckingAccount c3=new CheckingAccount(1,3);
                    c3.withdraw(2);
                }catch(Exception e3){
                    System.out.println(e3.getMessage());
                }
            }
        }
    }
}