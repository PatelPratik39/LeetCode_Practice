package LeetCode_problems;

public class LongestCommonPrefix {

    private static String longestCommonPrefix ( String[] strs ) {
//        Edge case
        if(strs == null || strs.length == 0){
            return "";
        }

//        define first index element of an array as prefix
        String prefix = strs[0];
//      Iterate over string array
        for(int i = 0; i < strs.length; i++){
            //run a loop till index position of prefix of strs's index of I
            while(strs[i].indexOf(prefix) != 0){
//                set prefix with comparision of each substring thatn gradually decrease
                prefix = prefix.substring(0, prefix.length() - 1);
//  if prefix get empty while iterating then return empty string
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;  // return prefix at the end.


    }

    public static void main ( String[] args ) {
        // Test cases
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs2)); // Output: ""

        String[] strs = {"interspecies", "interstellar", "interstate"};
        System.out.println(longestCommonPrefix(strs)); // Output: "inters"
    }


}
