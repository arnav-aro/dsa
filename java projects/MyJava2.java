import java.util.Scanner;
class MyJava2{
    public void posNegZero() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no: ");
        int no = sc.nextInt();
        if (no>0) {
            System.out.println("Postive");
        }
        if (no<0) {
            System.out.println("Negative");
        }
        if (no==0) {
            System.out.println("Zero");
        }
    }
    public static void main(String[] args) {
        MyJava2 m = new MyJava2();
        m.posNegZero();
    }
}
