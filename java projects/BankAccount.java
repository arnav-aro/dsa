
import java.util.*;

class BankAccount{
    int accono,balance,depositamt,amt;
    String cname,city;

    Scanner sc=new Scanner(System.in);
    public void inputData(){
       System.out.println("Enter the account number ");
       accono=sc.nextInt();
       System.out.println("Enter the balance ");
       balance=sc.nextInt();
       System.out.println("Enter customer name ");
       cname=sc.next();
       System.out.println("Enter the city name ");
       city=sc.next();
    }
    
    public void display(){
        System.out.println("Account number is: "+accono);
        System.out.println("Balance is: "+balance);
        System.out.println("Customer Name is: "+cname);
        System.out.println("City is: "+city);
        System.out.println("Deposit amount  is: "+amt);
       
    }
    public void deposit (int amt){
        
        balance=balance+amt;
        System.out.println("Balance after deposit is "+amt);

        
    }

    public void withdraw(int amt){
        System.out.println("Enter the amount to withdraw");

        balance=balance-amt;
        System.out.println("The balance after withdrawal is "+balance);
    }
}

class SavingsAccount extends BankAccount {


    public void withdraw(){
        System.out.println("Enter amount to be withdrawn ");
        
        amt=sc.nextInt();
        if(super.balance-amt>=1000){
            super.withdraw(amt);
        }
        else{
            System.out.println("The amount cannot be withdrawn due to insufficient balance ");
        }
    }

}


class Main {
    public static void main(String args[]){
        SavingsAccount sa=new SavingsAccount();
        Scanner s=new Scanner(System.in);
        int choice;
       while(true){ 
        System.out.println("Enter the choice ");
        System.out.println("1.Input the data ");
        System.out.println("2.Display the data ");
        System.out.println("3.Deposit amount ");
         System.out.println("4.Withdraw the amount ");
          System.out.println("5.Exit ");
          choice=s.nextInt();
        switch(choice){
            case 1: sa.inputData();
            break;
            case 2:sa.display();
            break;
            case 3:sa.deposit(1230);
            break;
            case 4:sa.withdraw();
            break;
            case 5:System.exit(0);
            break;


                }        }
    }
}
