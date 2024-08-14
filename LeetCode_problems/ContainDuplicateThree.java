package LeetCode_problems;

import java.util.TreeSet;

public class ContainDuplicateThree {

    private static boolean containsDuplicateThree ( int[] nums, int indexDiff, int valueDiff ) {
        //using TreeSet
        // i need to initialize treeset first because it has better optimization technique for retrieval and sort
        TreeSet<Long> set = new TreeSet <>();
        //iterate over an array
        for(int i = 0; i < nums.length; i++){
            Long num = (long) nums[i];

            Long ceil = set.ceiling(num);  // finds the smallest number in TreeSet that is greater or equal to num
            if(ceil != null && ceil - num <= valueDiff){
                return true;
            }

            Long floor = set.floor(num); // find tghe largest number in Treeset that is smaller or equak to num
            if(floor != null && num - floor <= valueDiff){
                return true;
            }
//            add current number to tree
            set.add(num);

            //maintaining the sliding window
            if(i >= indexDiff){ //if currentIndex i is greater than or equal to indexDiff
                set.remove( (long) nums[i - indexDiff]);    //the element at index i - indexDiff is removed from treeSet
            }
        }
        return false;  // if loop finish without finding a pair then return false
    }

    public static void main ( String[] args ) {
//        int[] nums = {1,2,3,1};
//        int indexDiff = 3;
//        int valueDiff = 0;
        int[] nums = {1,5,9,1,5,9};
        int indexDiff = 2;
        int valueDiff = 3;
        System.out.println(containsDuplicateThree(nums, indexDiff, valueDiff));
    }


}
