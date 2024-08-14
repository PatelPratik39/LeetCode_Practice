package LeetCode_poblems;

public class PowerOfThree {
    private static boolean isPowerOfThree ( int n ) {

        int i = 1;
         while(i < n){
             i = i * 3;
         }
         return i == n;
    }
    public static void main ( String[] args ) {
        int n = 27;
        System.out.println( isPowerOfThree(n));
    }


}
