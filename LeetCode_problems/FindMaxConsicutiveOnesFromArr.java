package LeetCode_problems;

public class FindMaxConsicutiveOnesFromArr {
    private static int printMaxConsicutiveOnes ( int[] nums ) {

        int maxLength = 0;
        int currentLength = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            }else {
                currentLength = 0;
            }
        }
        return maxLength;
    }

    public static void main ( String[] args ) {
        int[] nums = {1,1,0,1,1,1,0,1};
        System.out.println(printMaxConsicutiveOnes(nums));
    }


}
