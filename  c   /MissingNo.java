import java.util.Arrays;
import java.util.Scanner;

public class MissingNo {
    public static int findMissingNumber(int[] nums) {
        int n = nums.length;

        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

        
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }

        
        return n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int length = scanner.nextInt();

        int[] nums = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(nums));

        
        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing number: " + missingNumber);
    }
}
