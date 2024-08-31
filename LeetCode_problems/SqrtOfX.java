/**
 * 69. Sqrt(x)
 *Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 *
 * You must not use any built-in exponent function or operator.
 *
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 *
 *
 * Example 1:
 *
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * Example 2:
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 *
 */


package LeetCode_problems;

public class SqrtOfX {

    private static int mySqrt ( int x ) {
//        binary Search Approach because int this problem we have range of 0 to x and need to find square root of x
        int left = 1; // i need to set left =1 because if i set it as 0 then square root of 0 will be 0 which is wrong answer.
        int right = x;
        int sum = 0;

        while(left <= right){
            int mid = left + (right-left) / 2;   // to avoid Integer Overflow

            //if mid * mid  = value that is smaller than x then set sum as mid
            if(mid <= x/mid){  // mid * mid can cause Overflow so i used mid <= x / mid
                sum = mid;
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return sum;

    }
    public static void main ( String[] args ) {
        System.out.println(mySqrt(4));  // Output: 2
        System.out.println(mySqrt(8));  // Output: 2
        System.out.println(mySqrt(16)); // Output: 4
        System.out.println(mySqrt(1));  // Output: 1
        System.out.println(mySqrt(0));  // Output: 0
    }


}
