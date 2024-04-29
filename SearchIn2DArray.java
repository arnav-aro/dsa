import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
            {12,23,43},
            {1,7},
            {67,98,30},
            {14,56,34,76}
        };
        int target = 34
        ;
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    
    static int [] search(int [][] arr, int target){
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c]==target) {
                    return new int [] {r,c};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
