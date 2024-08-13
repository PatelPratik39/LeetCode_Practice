/**
 * 153. Find Minimum in Rotated Sorted Array
 */

package Leetcode_153;

public class FindMinInRotateSortedArray {
    private static int findMin ( int[] nums ) {
        int low = 0;
        int high = nums.length - 1;

        while(low < high) {
            int mid = low + (high-low) / 2 ;  // use this calculation to avoid integerOverflow exception

            if(nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return nums[high];
    }

    public static void main ( String[] args ) {
//        int[] nums = {3,4,5,1,2};
//        int nums[] = {4,5,6,7,0,1,2};
        int[] nums = {11,13,15,17};
        System.out.println(findMin(nums));
    }
}
