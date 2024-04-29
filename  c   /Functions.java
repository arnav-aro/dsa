// import java.util.*;

// public class Functions {
//     public static int calculateSum(int a, int b){
//         int sum = a+b;
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = calculateSum(a, b);
//         System.out.println(sum);
//     }    
// }

// import java.util.*;

// public class Functions {
//     public static int calculateProduct(int a, int b){
//         int product = a*b;
//         return product;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int product = calculateProduct(a, b);
//         System.out.println(product);
//     }    
// }


import java.util.*;

public class Functions {

    public static int factorialCalc(int n){
        int fact = 1;
        for(int i = n; i>=1 ;i--){
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorialCalc(n);
        System.out.println(fact);
    }
}