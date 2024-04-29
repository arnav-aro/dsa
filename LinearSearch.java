public class LinearSearch {
    public static void main(String[] args) {
        int [] nums={1,-15, 34, 65,87,-9};
        int target = 65;
        int ans = ls(nums, target );
        System.out.println(ans);
    }
        
        static int ls(int [] arr, int target){
            if (arr.length==0) {
                return -1;
            }

            for (int index = 0; index < arr.length; index++) {
                if(arr[index]==target){
                    return index;
                }
            }
            return -1;//no target found so return -1
        }
    
}
