import java.util.Scanner;
class MyJava1{
    public void evenOdd() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no: ");
        int no = sc.nextInt();
        if (no%2==0) {
            System.out.println("EVEN");
        }
        if (no%2!=0) {
            System.out.println("ODD");
        }
    }
    public static void main(String[] args) {
        MyJava1 m = new MyJava1();
        m.evenOdd();
    }
}
