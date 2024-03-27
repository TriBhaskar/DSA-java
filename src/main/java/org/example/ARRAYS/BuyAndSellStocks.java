package org.example.ARRAYS;

import java.util.Arrays;

public class BuyAndSellStocks {
    //You are given an array prices where proces[i] is the price of a given stock on the ith day. You want to maximize your profit by
    // choosing a single day to buy one stock and choosing a single day to buy one stock and choosing a different day in the future to sell
    //  that stock. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
    //Prices = [7,1,5,3,6,4]
    //Profit = Selling price - Buying price

    public static int buyAndSellStocks(int prices[]){
        int maxProfit=0, profit=0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i=0; i<prices.length; i++){
            if(buyPrice<prices[i]){
                profit=prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("maxProfit will be :"+buyAndSellStocks(prices));
    }

}
