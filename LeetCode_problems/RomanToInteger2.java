package LeetCode_problems;

public class RomanToInteger2 {

    private static String intToRoman ( int num ) {
        // Define the Roman numeral values and symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

//        build String
        StringBuilder romanChar = new StringBuilder();

        for(int i = 0; i < values.length; i++){
            while(num >= values[i]){
                romanChar.append(symbols[i]);
                num -= values[i];
            }
        }
        return romanChar.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(intToRoman(3749)); // Output: "MMMDCCXLIX"
        System.out.println(intToRoman(58));   // Output: "LVIII"
        System.out.println(intToRoman(1994)); // Output: "MCMXCIV"
    }


}
