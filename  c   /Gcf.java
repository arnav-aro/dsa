import java.util.*;
public class Gcf {
    
    public static void greatestDivisor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter no 2: ");
        int n2 = sc.nextInt();
        int gcf  = 1;
        for(int i= 1; i<=n1 && i<=n2; i++ ){
            if (n1%i==0 && n2%i==0) {
                gcf = i;
            }
        }
        System.out.println("gcf: "+gcf);
        
    }
    public static void main(String[] args) {
        greatestDivisor();
    }
}
