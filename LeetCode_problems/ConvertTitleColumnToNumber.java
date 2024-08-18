package LeetCode_problems;

import java.util.Scanner;

public class ConvertTitleColumnToNumber {

    private static String convertToTitle ( int columnNumber ) {

        StringBuilder result = new StringBuilder();

        while(columnNumber > 0 ){
            columnNumber--;
            int remainder = columnNumber % 26;
            char ch = (char) ('A' + remainder);
            result.insert(0, ch);
            columnNumber = columnNumber / 26;
        }
        return result.toString();
    }
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find column in Excel sheet : ");
        int columnNumber = scanner.nextInt();
        System.out.println(convertToTitle(columnNumber));
        scanner.close();
    }
}
