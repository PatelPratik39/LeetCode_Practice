/**
 *A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 *
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * Example 3:
 *
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 *
 */

package LeetCode_problems;

public class ValidPalindrome {

    private static boolean isValidPalindrome ( String s ) {
        //convert int lowercase
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        //check the string if its a alphanumeric or not

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122 || s.charAt(i) >= 48 && s.charAt(i) <= 57){
                sb.append(s.charAt(i));
            }
        }
        for(int i = 0; i < sb.length(); i++){
            if(sb.charAt(i) != sb.charAt(sb.length() - 1 - i)){
                return false;
            }
        }
        return true;

    }
    public static void main ( String[] args ) {
       String s = "A man, a plan, a canal: Panama";
        System.out.println(isValidPalindrome(s));
    }


}
