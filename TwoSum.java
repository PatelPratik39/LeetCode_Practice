import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // Made public for better access from other classes
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numToIndex.containsKey(complement)) {
                // Return the indices of the numbers that add up to the target
                return new int[]{numToIndex.get(complement), i};
            }

            // Store the index of the current number
            numToIndex.put(nums[i], i);
        }

        // Return an empty array if no solution is found
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        // Example 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        if (result1.length > 0) {
            System.out.println("Output: [" + result1[0] + "," + result1[1] + "]"); // Output: [0,1]
        } else {
            System.out.println("No solution found for Example 1");
        }

        // Example 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        if (result2.length > 0) {
            System.out.println("Output: [" + result2[0] + "," + result2[1] + "]"); // Output: [1,2]
        } else {
            System.out.println("No solution found for Example 2");
        }

        // Example 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        if (result3.length > 0) {
            System.out.println("Output: [" + result3[0] + "," + result3[1] + "]"); // Output: [0,1]
        } else {
            System.out.println("No solution found for Example 3");
        }
    }
}
