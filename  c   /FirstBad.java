import java.util.*;

public class FirstBad{
    public void firstBadVersion(int bad, int n){
        for(int i = 1; i<=n; i++){
            if (i<bad){
                System.out.println("False");
            }
            else{
                System.out.println("True");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of version:");
        int a = sc.nextInt();
        System.out.println("Enter bad version:");
        int b = sc.nextInt();
        FirstBad fb = new FirstBad();
        fb.firstBadVersion(b,a);
    }
}
