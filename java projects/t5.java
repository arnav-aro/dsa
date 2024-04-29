// import java.util.Scanner;
// class Factorial{
//     public static void main(String[] args){
//         int no, fact=1;
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter a no: ");
//         no = sc.nextInt();
//         while (no>0) {
//             fact=fact*no;
//             --no;
//         }
//         System.out.println("factorial is " +fact);
//     }
// }

import java.util.*;
class Factorial{
    public static void main(String[] args) {
        int no, fact=1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter no: ");
        no = sc.nextInt();
        for(int i=1; i<=no; ++i){
            fact= fact*i;
        }
        System.out.println("factorial is " +fact);
    }
}