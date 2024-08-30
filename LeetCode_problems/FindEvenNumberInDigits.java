package LeetCode_problems;

public class FindEvenNumberInDigits {
    private static int printEvenDigitsNum ( int[] nums ) {

        int count = 0;  //initialize count at 0
        for(int num : nums){    //iterate over an array
            int digitCount = (int) Math.log10(num)+1;   //count digit using Math function using .logof 10 anf add 1 for digit
            if(digitCount % 2 == 0){  // if digit count is divided by 2 and get 0 that means its even
                count++; // add even numbers
            }
        }
        return count;  // return final count
    }

    public static void main ( String[] args ) {
        int[] nums = {12,345,2,6,7896};
//        int nums= {555,901,482,1771};

        System.out.println(printEvenDigitsNum(nums));
    }


}
