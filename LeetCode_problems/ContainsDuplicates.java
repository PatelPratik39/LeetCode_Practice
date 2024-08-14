/*

217. Contains Duplicate
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

package LeetCode_problems;

import java.util.ArrayList;
import java.util.HashSet;

public class ContainsDuplicates {
    private static boolean containDuplicates ( int[] nums ) {
/*
  Worst Time Complexity O(n ^2)
  for(int i = 0; i < nums.length; i++){
            for(int j = i +1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
 */

        /**
         * Second Approach  is the best because of O(1) time complexity
         */
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;

        /**
         * Third Approach
         */
//        ArrayList <Integer> set = new ArrayList <>();
//        for(int i : nums){
//            if(set.contains(i)){
//                return true;
//            }
//            set.add(i);
//        }
//        return false;

    }

    public static void main ( String[] args ) {
        int[] nums = {1,2,3,1};

        System.out.println(containDuplicates(nums));
    }


}
