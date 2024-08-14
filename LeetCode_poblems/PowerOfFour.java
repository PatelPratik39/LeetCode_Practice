package LeetCode_poblems;

public class PowerOfFour {
    private static boolean isPowerOfFour ( int n ) {
//        int i = 1;
        if( n <= 0){
            return false;
        }
        while( n % 4 == 0){
            n = n /4;
        }
        return n == 1;
    }


    public static void main ( String[] args ) {
        int n =16;
        System.out.println(isPowerOfFour(n));
    }


}
