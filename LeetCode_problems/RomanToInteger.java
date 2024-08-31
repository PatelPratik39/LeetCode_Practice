package LeetCode_problems;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static int romanToInt ( String s ) {
        Map <Character, Integer> romanChar = new HashMap <>();
        int total = 0;
        romanChar.put('I', 1);
        romanChar.put('V', 5);
        romanChar.put('X',10);
        romanChar.put('L', 50);
        romanChar.put('C', 100);
        romanChar.put('D',500);
        romanChar.put('M', 1000);

        for(int i = 0; i < s.length() -1; i++){
            int currentValue = romanChar.get(s.charAt(i));

            if(i < s.length() - 1 && currentValue < romanChar.get(s.charAt(i + 1))){
                total = total - currentValue;
            } else {
                total = total + currentValue;
            }
        }
        return total;
    }
    public static void main ( String[] args ) {
//        String s = "III";
//        System.out.println(romanToInt(s));  // Output: 3
//
        String s = "LVIII";
        System.out.println(romanToInt(s));  // Output: 58

//        String s = "MCMXCIV";
//        System.out.println(romanToInt(s));  // Output: 1994
    }


}
