import java.util.Scanner;
class Armstrong1{
    public static void main(String[] args){
        double no, sum=0, rem;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a no: ");
        no = sc.nextInt();
        double nsave =no;
        System.out.println("Enter digits: ");
        double a = sc.nextInt();
        while (no>0) {
            for(double i=0;i<=a;++i){
            rem = no%10;
            sum =sum+(Math.pow(rem, a));
            no=no/10;
            };
        }
        if (nsave==sum) {
            System.out.println(+nsave+ " is armstrong");
        }
        else {
            System.out.println(+nsave+ " is not armstrong");
        }
    }
}


// code galat hai thik kr