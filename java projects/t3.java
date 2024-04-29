import java.util.Scanner;
class AddDigit{
    public static void main(String[] args){
        int no, rem , sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a no: ");
        no = sc.nextInt();
        while (no>0) {
            rem = no%10;
            sum =sum+rem;
            no=no/10;
        }
        System.out.println("sum of digits of no is "+ sum);
    }
}