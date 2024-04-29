import java.util.Scanner;

abstract class BankAccount {
    int accono, balance, depositamt, amt;
    String cname, city;
    final int max_limit = 5000;
    Scanner sc = new Scanner(System.in);

    public void inputData() {
        System.out.println("Enter the account number ");
        accono = sc.nextInt();
        System.out.println("Enter the balance ");
        balance = sc.nextInt();
        System.out.println("Enter customer name ");
        cname = sc.next();
        System.out.println("Enter the city name ");
        city = sc.next();
    }
    public void display() {
        System.out.println("Account number is: " + accono);
        System.out.println("Balance is: " + balance);
        System.out.println("Customer Name is: " + cname);
        System.out.println("City is: " + city);
        System.out.println("Deposit amount  is: " + amt);

    }
    public abstract void deposit(int amt);
    public abstract void withdraw();

    public void inputCustData() {
        System.out.println("Non-abstract method: Input Customer Data");
    }
    public void showCustData() {
        System.out.println("Non-abstract method: Show Customer Data");
    }
}
class SavingsAccount extends BankAccount {

    @Override
    public void deposit(int amt) {
        balance = balance + amt;
        System.out.println("Balance after deposit is " + balance);
    }

    @Override
    public void withdraw() {
        System.out.println("Enter amount to be withdrawn ");
        amt = sc.nextInt();
        if (super.balance - amt >= 1000) {
            super.balance = super.balance - amt;
            System.out.println("The balance after withdrawal is " + super.balance);
        } else {
            System.out.println("The amount cannot be withdrawn due to insufficient balance ");
        }
    }
}
class CurrentAccount extends BankAccount{
    public void deposit(int amt){
        balance = balance +amt;
        System.out.println("Balance after deposit is "+balance);
    }
     @Override
    public void withdraw() {
        System.out.println("Enter amount to be withdrawn ");
        amt = sc.nextInt();
        if (super.balance - amt >= 1000) {
            super.balance = super.balance - amt;
            System.out.println("The balance after withdrawal is " + super.balance);
        } else {
            System.out.println("The amount cannot be withdrawn due to insufficient balance ");
        }
    }
}

class Interest1 extends SavingsAccount{
    public void calculateInterest(){
        double interest = super.balance*0.04;
        System.out.println("Interest calculated on SavingsAccount: " + interest);
    }
}
class Interest2 extends CurrentAccount{
    public void calculateInterest(){
        double interest = super.balance*0.02;
        System.out.println("Interest calculated on CurrentAccount: " + interest);
    }
}

public class Banking {
    public static void main(String args[]) {
        Interest1 interest1 = new Interest1();
        Interest2 interest2 = new Interest2();
        Scanner s = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Enter the choice ");
            System.out.println("1. Input the data ");
            System.out.println("2. Display the data ");
            System.out.println("3. Deposit amount ");
            System.out.println("4. Withdraw the amount ");
            System.out.println("5. Calculate interest ");
            System.out.println("6. Exit ");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    interest1.inputData();
                    break;
                case 2:
                    interest1.display();
                    break;
                    case 3:
                    System.out.println("Enter the amount to be deposited: ");
                    int depositAmount = s.nextInt();
                    interest1.deposit(depositAmount);
                    break;
                case 4:
                    interest1.withdraw();
                    break;
                case 5:
                    interest1.calculateInterest();
                    interest2.calculateInterest();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }
}