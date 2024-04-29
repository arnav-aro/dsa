// import java.util.*;
// class FiveDigitNo{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a no:");
//         int n = sc.nextInt();
//         int x = n%10;
//         int y = n/10;
//         for(int i=1; i<=3; ++i){
//             y=y/10;
//         }
//         int res =x+y;
//         System.out.println(res);
//     }
// }

import java.util.*;
class FiveDigitNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no:");
        int n = sc.nextInt();
        int x = n%10;
        int y = n/10000;
        System.out.println(x+y);
    }
}