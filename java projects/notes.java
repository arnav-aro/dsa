import java.util.Scanner;
class Notes{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount");
    int amt = sc.nextInt();
    System.out.println("Enter the range(2000,500,200,100,50,20,10,5,2,1)");
    int note = sc.nextInt();
    int n;
    switch(note) {
        case 2000: n= amt/2000;
            System.out.println("2000"+ n + (2000*n));
            amt=amt%2000;
        case 500: n = amt/500;
            System.out.println("500"+ n + (500*n));
            amt=amt%500;
        case 200: n = amt/500;
            System.out.println("500"+ n + (500*n));
            amt=amt%500;
        case 100: n = amt/500;
            System.out.println("500"+ n + (500*n));
            amt=amt%500;
        case 50: n = amt/500;
            System.out.println("50"+ n + (50*n));
            amt=amt%500;
        case 20: n = amt/500;
            System.out.println("20"+ n + (20*n));
            amt=amt%500;    
        case 10: n = amt/500;
            System.out.println("10"+ n + (10*n));
            amt=amt%500;
        case 5: n = amt/500;
            System.out.println("5"+ n + (5*n));
            amt=amt%500;
        case 2: n = amt/500;
            System.out.println("2"+ n + (2*n));
            amt=amt%500;
        case 1: n = amt/500;
            System.out.println("1"+ n + (1*n));
            amt=amt%500;
        default:System.out.println("invalid input");
    }
}
}   