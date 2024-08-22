package LeetCode_problems;

public class FindFirstNlastInSortedArray {

    private static int[] findFirstAndLastElement ( int[] nums , int target) {
//        use binary search to achieve O(log n)
//        first cover base case
        if(nums.length == 0){
            return new int[] {-1, -1};
        }

        int low = 0;
        int high = nums.length - 1;
        int result[] = new int[2]; /// create new int array so i can store the first and last index element

        while(low < high){
            int mid = low + (high - low) /2;

            if(nums[mid] < target){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        if(nums[low] != target){
            return new int[] {-1,-1};
        }
        result[0] = low;
        high = nums.length;

        while(low < high){
            int mid = low + (high - low) / 2;

            if(nums[mid] <= target){
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        result[1] = low-1;
        return result;

    }

    public static void main ( String[] args ) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] result = findFirstAndLastElement(nums, target);
        System.out.println("First occurrence: " + result[0] + ", Last occurrence: " + result[1]);

    }


}
