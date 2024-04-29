import java.util.Scanner;
class Reverse{
    public static void main(String[] args){
        int no, rev = 0 , rem;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a no: ");
        no = sc.nextInt();
        while (no>0) {
            rem = no%10;
            rev =rev*10+rem;
            no = no/10;
        }
        System.out.println("Revese no is "+ rev);
    }
}