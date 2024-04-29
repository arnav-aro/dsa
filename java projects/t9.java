import java.util.*;
class Fibonacci{
    public static void main(String[] args) {
        int f0=0,f1=1,f2;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter range: ");
        int n = sc.nextInt();
        System.out.print(f0+"\t"+f1);
        for(int i=3; i<=n;++i){
            f2= f0+f1;
            System.out.print("\t"+f2);
            f0=f1;
            f1=f2;
        }
    }
}