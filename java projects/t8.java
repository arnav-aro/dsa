import java.util.*;
class EvenNoSum{
    public static void main(String[] args) {
        int sum=0;
        Scanner sc =new Scanner(System.in);
        for(int i=1;i<=20;++i){
            if(i%2==0){
                sum=sum+i;
            }
        }
        System.out.println(sum);
    }
}