import java.util.*;
public class ProductSmallPair {
    Scanner sc = new Scanner(System.in);
    public void psp(){
        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();
        System.out.println("Enter array size: ");
        int size  = sc.nextInt();
        System.out.println("Enter ur array: ");
        int [] arr= new int[size];
        for(int i = 0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        //sort array
        Arrays.sort(arr);
        if ((arr[0]+arr[1])<sum) {
            System.out.println(arr[0]*arr[1]);
        }
        else
            System.out.println(sum);

    }

    public static void main(String[] args) {
        ProductSmallPair ps = new ProductSmallPair();
        ps.psp();
    }
}
