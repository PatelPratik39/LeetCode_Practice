/**
 * 121. Best Time to Buy and Sell Stock
 *
 */

package Leetcode_153;

public class BestTimToBuyAndSellStock {
    private static int findMaxProfit ( int[] prices ) {
        //base case
        if(prices == null || prices.length == 0){
            return 0;
        }
        int minPrice = Integer.MAX_VALUE;  // buying prices
        int maxProfit = 0;

        for(int price :  prices){
            if(price < minPrice){
                minPrice = price;
            } else if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main ( String[] args ) {
//        int prices[] = {7,1,5,3,6,4};
        int prices[] = {7,6,4,3,1};

        System.out.println(findMaxProfit(prices));
    }


}
