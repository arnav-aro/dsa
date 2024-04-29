import java.util.*;
public class Fib {
    public static void Fibonacci(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();
        int f0=0, f1=1, f2;
        System.out.print(f0+"\t"+f1);
        for(int i = 3; i<=n; i++ ){
            f2=f1+f0;
            System.out.print("\t"+f2);
            f0= f1;
            f1= f2;
            
        }
    }
    public static void main(String[] args) {
        Fibonacci();
    }
}
