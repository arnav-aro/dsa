import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int [] nums = {3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    }
    static void change(int [] arr){
        arr[0]=99;
        arr[2]=57;
    }
}
