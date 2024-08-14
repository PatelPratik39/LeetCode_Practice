/**
 *
 * 278. First Bad Version
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, bad = 4
 * Output: 4
 * Explanation:
 * call isBadVersion(3) -> false
 * call isBadVersion(5) -> true
 * call isBadVersion(4) -> true
 * Then 4 is the first bad version.
 * Example 2:
 *
 * Input: n = 1, bad = 1
 * Output: 1
 *
 *
 * Constraints:
 *
 * 1 <= bad <= n <= 231 - 1
 */

package LeetCode_problems;

public class FirstBadVersion {
    private static int findFirstBadVersion ( int n ) {
//        create two pointer low and right so I can find mid and check if mid has and true then check low or mid otherwise check right
        int low = 0;
        int high = n;

        while( low < high) {
            int mid = low + (high-low) / 2;

            if(isBadVersion(mid)){
                high = mid;
            } else {
                low = mid + 1;
            }
        }
//        return low;
        return high;
    }

    private static boolean isBadVersion ( int mid ) {
        return false;
    }

    //i need to use Binary Search so i need to find low, high and mid
    public static void main ( String[] args ) {
        int n = 5;
        int bad = 4;
        System.out.println(findFirstBadVersion(n));
    }


}
