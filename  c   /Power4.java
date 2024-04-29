import java.util.*;

public class Power4 {
    public void powerOfFour(int n) {
        int i = 1;
        while (Math.pow(i, 4) <= n) {
            if (Math.pow(i, 4) == n) {
                System.out.println("True");
                return; 
            }
            i++;
        }
        System.out.println("False"); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Power4 p = new Power4();
        System.out.println("Enter the number:");
        int c = sc.nextInt();
        p.powerOfFour(c);
    }
}

