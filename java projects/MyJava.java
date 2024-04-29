import java.util.Scanner;
class MyJava{
    public void voting() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("eligible");
        }
        if (age<18) {
            System.out.println("not eligible");
        }
    }
    public static void main(String[] args) {
        MyJava m = new MyJava();
        m.voting();
    }
}
