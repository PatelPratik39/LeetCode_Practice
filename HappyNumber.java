/**
 * 202. Happy Number
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 * Example 2:
 *
 * Input: n = 2
 * Output: false
 *
 */



import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    private static boolean isHappy ( int n ) {
        Set <Integer> seen = new HashSet <>();

        while(n != 1 && !seen.contains(n)){
            seen.add(n);
            n = getNextNum(n);
        }
        return n == 1;
    }

    private static int getNextNum ( int n ) {

        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main ( String[] args ) {
//        HappyNumber happy = new HappyNumber();
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));

    }


}
