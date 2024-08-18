/**
 * 171. Excel Sheet Column Number
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 *
 *
 * Example 1:
 *
 * Input: columnTitle = "A"
 * Output: 1
 * Example 2:
 *
 * Input: columnTitle = "AB"
 * Output: 28
 * Example 3:
 *
 * Input: columnTitle = "ZY"
 * Output: 701
 */


package LeetCode_problems;

import java.util.Scanner;

public class ExcelSheetColumnNumber {
    private static int titleColumn ( String columnTitle ) {
//        int result = 0;
//        for(int i = 0; i < columnTitle.length(); i++){
//            int value = columnTitle.charAt(i) - 'A' + 1;
//            result  =result * 26 + value;
//        }
//        return result;

        char[] c = columnTitle.toCharArray();
        int result = 0;
        for(int i =0; i < c.length; i++){
            int value = c[i] - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }

    public static void main ( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Excel Column  title : ");
        String columnTitle = sc.nextLine();
        System.out.println(titleColumn(columnTitle));
    }


}
