// // pattern 1
// public class p1 {
//     public static void main(String[] args) {
//         for(int i = 1; i<=4; i++){
//             for(int j = 1; j<=5; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// pattern2
// public class p1 {

//     public static void main(String[] args) {
//         for(int i = 1;i<=4; i++){
//             for(int j = 1; j<=5;j++){
//                 if (i==1||j==1||i==4||j==5) {
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// pattern3
// public class p1 {

//     public static void main(String[] args) {
//         for(int i =1; i<=4;i++){
//             for(int j =1; j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// pattern4
// public class p1 {

//     public static void main(String[] args) {
//         for(int i = 1;i<=4;i++){
//             for(int j = 4; j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class p1 {

//     public static void main(String[] args) {
//         for(int i =5; i>=1;i--){
//             for(int j =1; j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class p1 {

//     public static void main(String[] args) {
//         for(int i = 1; i<=4; i++){
//             for(int j=1;j<=4-i;j++){
//                 System.out.print(" ");
                
//             }
//             for(int j = 1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// public class p1 {

//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++){
//             for(int j =1 ; j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//     }
// }

// public class p1 {

//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++){
//             for(int j =1 ; j<=5-i+1;j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }

//     }
// }

// floyds triangle
// public class p1 {

//     public static void main(String[] args) {
//         int n = 5; 
//         int number  = 1;
//         for(int i = 1; i<= n;i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }


// public class p1 {

//     public static void main(String[] args) {
//         int n = 5;
//         for(int i = 1; i<=n;i++){
//             for(int j = 1;j<=i;j++){
//                 if ((i+j)%2==0) {
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
                
//             }
//             System.out.println();
//         }
//     }
// }

// ajeeb pattern butterfly wala
// public class p1 {

//     public static void main(String[] args) {
//         int n =4;
//         for(int i  = 1; i<=n; i++){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j<=2*(n-i) ;j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         for(int i  = n; i>=1; i--){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             for(int j = 1; j<=2*(n-i) ;j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
        
//     }
// }

import java.util.Scanner;

public class p1 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
            }
            System.out.println("================================");

    }
}