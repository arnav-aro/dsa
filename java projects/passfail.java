import java.util.Scanner;
class PassFail{
    public void check() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter marks for ppr 1: ");
        int p1 = sc.nextInt();
        System.out.println("Enter marks for ppr 2: ");
        int p2 = sc.nextInt();
        System.out.println("Enter marks for ppr 3: ");
        int p3 = sc.nextInt();
        int total= p1+p2+p3;
        int per=(p1+p2+p3)/3;
        System.out.println("Enter gender(m/f):");
        char ch = sc.next().charAt(0);
        if (per>=62 && ch=='f') {
             System.out.println("admission done ");
        }
        if (per>=62 && ch=='m') {
             System.out.println("admission done ");
        }
        else{
             System.out.println("nhi milra ");
        }
    }
    public static void main(String[] args) {
        PassFail m = new PassFail();
        m.check();
    }
}
