/**
 *
 * 167. Two Sum II - Input Array Is Sorted
 * Example 1:
 *
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 * Example 2:
 *
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
 * Example 3:
 *
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 * Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 */

package LeetCode_problems;

import java.util.Arrays;

public class TwoSumII {

    private static int[] findSumOfTwoII(int[] nums, int target) {
        // Two pointers approach
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // Return 1-based indices
            } else if (sum > target) {
                right--; // Move the right pointer to the left
            } else {
                left++; // Move the left pointer to the right
            }
        }
        return new int[]{-1, -1}; // Shouldn't reach here as per problem constraints
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(findSumOfTwoII(nums, target))); // Use Arrays.toString to print the result array
    }

}


