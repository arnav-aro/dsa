import java.util.*;
class Array2d {
    public static void main(String[] args) {
        int arr[][]= new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array values: ");
        for(int i=0; i<3; i++ ){
            for(int j=0; j<3;++j){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("array values are: ");
        for(int i =0; i<3;++i){
            for(int j=0; j<3; ++j){
                sum=sum+arr[i][j];
            }
        }
    }
}
