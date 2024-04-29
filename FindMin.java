public class FindMin {
    public static void main(String[] args) {
        int [] arr = {2,3,45,56,12};
        System.out.println(min(arr));
    }

    static int min(int [] arr){
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
