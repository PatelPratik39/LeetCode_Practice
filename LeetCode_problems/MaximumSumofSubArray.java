package LeetCode_problems;

public class MaximumSumofSubArray {

    private static int printMaxSumSubArray ( int[] arr ) {
        int sum = arr[0];
        int currentSum = arr[0];

        for(int i = 1; i < arr.length;i++){
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum = currentSum + arr[i];

            if(currentSum > sum){
                sum = currentSum;
            }
        }
        return sum;
    }

    public static void main ( String[] args ) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(printMaxSumSubArray(arr));

    }



}
