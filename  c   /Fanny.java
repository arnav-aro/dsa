import java.util.Scanner;

public class Fanny {
    public void removeCommonCharacters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string 1: ");
        String str1 = sc.next();
        char[] ch1 = str1.toCharArray();

        System.out.println("Enter your string 2: ");
        String str2 = sc.next();
        char[] ch2 = str2.toCharArray();

        System.out.println("Result after removing common characters:");

        for (int i = 0; i < str1.length(); i++) {
            boolean isCommon = false;

            for (int j = 0; j < str2.length(); j++) {
                if (ch1[i] == ch2[j]) {
                    isCommon = true;
                    break;
                }
            }

            if (!isCommon) {
                System.out.print(ch1[i]);
            }
        }
    }

    public static void main(String[] args) {
        Fanny f = new Fanny();
        f.removeCommonCharacters();
    }
}
