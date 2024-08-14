/*
35. Search Insert Position
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4


Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104

 */

package LeetCode_problems;

public class SearchInsertPosition {

    private static int searchInsertPosition ( int[] nums, int target ) {

        //array is sorted
//        i can use Binary Search to achieve faster retrieval
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;  // to avoid Integer overflow

            if( nums[mid] == target){  // if mid is equal to target value
                return mid;   // then return mid
            }else if(nums[mid] < target){  // else if nums[mid] is less than target value
                left = mid + 1;  // then set a pointer left to mid + 1
            } else {  //otherwise
                right = mid - 1;  // set a pointer right to mid - 1
            }
        }
        return left;  // if not found, then return left that is correct insertion point
    }
    public static void main ( String[] args ) {
        int[] nums = {1,3,5,6};
        int target = 7;   //output should be indexed = 2
//        int target2 = 7; //output should be indexed at 7;

        System.out.println(searchInsertPosition(nums, target));
    }
}
