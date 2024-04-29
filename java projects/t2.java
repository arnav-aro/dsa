import java.util.Scanner;
class CountDigit{
    public static void main(String[] args){
        int no, count = 0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a no: ");
        no = sc.nextInt();
        while (no>0) {
            no = no/10;
            ++count;
        }
        System.out.println("Total no of digits is "+ count);
    }
}