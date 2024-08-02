/*

Given an integer x, return true if x is a
palindrome
, and false otherwise.



Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?

 */

public class PalindromeNumber {


    private static boolean isPalindrome ( int x ) {
//        base case :  negative numbers are not palindrom
        if(x < 0){
            return false;
        }
//        numbers with starting at 0 and ending at 0 are not palindrom
        if(x != 0 && x % 10 == 0){
            return false;
        }

        int reversedHalf = 0;

        while ( x > reversedHalf){
//            now append the last digit from x to reversed half
            reversedHalf = reversedHalf * 10 + x % 10;

//            remove the last digit from x
            x /= 10;
//            x = x/10;
        }

//        now Check if the number is equal to the reversed half or the half without the last digit
        return x == reversedHalf || x == reversedHalf / 10;
    }


    public static void main ( String[] args ) {
        // Test cases
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(121));  // Output: true
        System.out.println(isPalindrome(-121)); // Output: false
        System.out.println(isPalindrome(10));   // Output: false
    }


}
