import java.util.Scanner;
class Leap{
    public void check() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
            if (year%100!=0) {
               if (year%4==0) {
                System.out.println(+year +"is a non century leap year");
               }
               else{
                System.out.println(+year +"is not a leap year");
               }
            }
            else{
                if (year%400==0) {
                   System.out.println(+year +"is a century leap year"); 
                }
                else{
                   System.out.println(+year +"is not a leap year"); 
                }
            }
        }
       
    
    public static void main(String[] args) {
        Leap m = new Leap();
        m.check();
    }
}
