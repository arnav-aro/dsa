import java.util.Scanner;
class Largest{
    public void check() {
        int big;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first no: ");
        int p1 = sc.nextInt();
        System.out.println("Enter second no: ");
        int p2 = sc.nextInt();
        System.out.println("Enter third no: ");
        int p3 = sc.nextInt();
        if (p1>p2) {
            if (p1>p3) {
                big=p1;
            }
            else{
                big=p3;
            }
        }
        else{
            if (p2>p3) {
                big=p2;
            }
            else {
                big=p3;
            }
        }
        System.out.println("Largest value is: "+big);
       
    }
    public static void main(String[] args) {
        Largest m = new Largest();
        m.check();
    }
}
