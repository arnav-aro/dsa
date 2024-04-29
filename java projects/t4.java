import java.util.Scanner;
class MultiplyDigit{
    public static void main(String[] args){
        int no, rem , product=1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a no: ");
        no = sc.nextInt();
        while (no>0) {
            rem = no%10;
            product = product*rem;
            no=no/10;
        }
        System.out.println("multiplication of digits of no is "+ product);
    }
}