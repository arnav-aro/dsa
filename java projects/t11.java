import java.util.*;
class Series{
    public static void main(String[] args) {
        double x,n,sum=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value:");
        x= sc.nextDouble();
        System.out.println("Enter n value:");
        n= sc.nextDouble();
        for (double i =1; i<=n; ++i){
            sum=sum+(Math.pow(x, i)/i);
        }
        System.out.println(sum);
        
        
    }
}