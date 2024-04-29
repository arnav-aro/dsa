import java.util.*;
public class DiffTwoArray {
    public void twoArray(){
        int [] arr1 = {1,2,3};
        int [] arr2 = {2,4,6};
        for(int i =0; i<arr1.length; i++){
            for(int j = 0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.println("the same no is: "+arr1[i]);
                }
            }
        } 
    }
    public static void main(String[] args) {
        DiffTwoArray d = new DiffTwoArray();
        d.twoArray();
    }
}
