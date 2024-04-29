import java.util.*;
class SeriesFact{
    public static void main(String[] args) {
        double x,n,sum=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x value:");
        x= sc.nextDouble();
        System.out.println("Enter n value:");
        n= sc.nextDouble();
        for (double i =1; i<=n; ++i){
            n = 1;
            double fact =1;
            while (n>0) {
                fact =fact*n;
                --n;
            }

            sum=sum+(Math.pow(x, i)/fact);
        }
        System.out.println(sum);
        
        
    }
}