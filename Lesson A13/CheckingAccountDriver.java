public class CheckingAccountDriver{
    public static void main(String args[]){
        try{
            CheckingAccount c1=new CheckingAccount(-1,1);
        }catch(Exception e1){
            System.out.println(e1.getMessage());
            try{
                CheckingAccount c2=new CheckingAccount(1,2);
                c2.deposit(-1);
            }catch(Exception e2){
                System.out.println(e2.getMessage());
                try{
                    CheckingAccount c3=new CheckingAccount(1,3);
                    c3.withdraw(2);
                }catch(Exception e3){
                    System.out.println(e3.getMessage());
                }
            }
        }
    }
}