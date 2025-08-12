

class account{
    String AccountNumber;
    double Balance;

            account(String an,double b){
        if ( an==null || (an.isEmpty())==true || b<0 ){
            System.out.println("Error!!!!");
        }
        else{
            AccountNumber=an;
            Balance=b;
            System.out.println("Success!!!");
        }
    }
    void printinfo(){
        System.out.println("Account number is "+AccountNumber);
        System.out.println("Balance is : "+Balance);
    }
}
public class accountjava {
    public static void main(String[] args){
        account ob1=new account("",-200);
        account ob2=new account("Tanvir123",500000);

        ob1.printinfo();
        ob2.printinfo();
    }
}
