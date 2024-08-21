/**
 *
 * You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
 *
 * Return the index of the peak element.
 *
 * Your task is to solve it in O(log(n)) time complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [0,1,0]
 *
 * Output: 1
 *
 * Example 2:
 *
 * Input: arr = [0,2,1,0]
 *
 * Output: 1
 *
 * Example 3:
 *
 * Input: arr = [0,10,5,2]
 *
 * Output: 1
 */

package LeetCode_problems;

public class PeakIndexMountainArray {
    private static int findPeakOfMountain ( int[] arr ) {

//        Linear Search approach with Time Complexity of O(n)
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > arr[i + 1]){
//                return i;
//            }
//        }
//        return -1;

//        Second Approach  using Lonear Search but time comlexity will be O(n)
//        int i = 0;
//        while(arr[i] < arr[ i + 1]){
//            i++;
//        }
//        return i;


//        Binary Search Approach with Time Complexity of O(n log n)
            int low = 0;
            int high = arr.length - 1;

            while(low < high) {
                //int mid = (high-low) / 2;   // this equation create integer Overflow condition so i can not use it
                int mid = low + (high - low) / 2;
                if(arr[mid] < arr[mid + 1]){
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
    }

    public static void main ( String[] args ) {
        int[] arr = {0,10,5,2};
        System.out.println(findPeakOfMountain(arr));
    }


}
