import java.util.Scanner;

public class MagicBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digits: ");
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = sc.nextInt();
        }

        System.out.print("Output: ");
        for (int i = 0; i < 4; i++) {
            char character = (char) digits[i];
            System.out.print(digits[i] + "-" + character + " ");
        }
    }
}
