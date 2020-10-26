package com.lzhenxing.myproject.algorithm;


/**
 *   ClassName: BuyAndSellStock <br/>   Function: <br/>
 * leetcode 121 股票最大利润
 * @author zhenxing.liu
 * @date 2020/10/25
 */
public class BuyAndSellStock {

    public static int maxProfit1(int[] prices){
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                maxProfit = (prices[j] - prices[i]) > maxProfit ? prices[j] - prices[i] : maxProfit;
            }
        }
        return maxProfit;
    }

    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minNum) {
                minNum = prices[i];
            }
            if (prices[i] - minNum > maxProfit) {
                maxProfit = prices[i] - minNum;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] price = {2,5,1,3};
        System.out.println(maxProfit1(price));
        System.out.println(maxProfit(price));
    }
}
