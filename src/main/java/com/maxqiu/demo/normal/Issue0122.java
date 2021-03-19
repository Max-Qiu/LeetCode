package com.maxqiu.demo.normal;

/**
 * 买卖股票的最佳时机 II
 * 
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 * 
 * @author Max_Qiu
 */
public class Issue0122 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4})); // 7
        System.out.println(maxProfit(new int[] {1, 2, 3, 4, 5}));// 4
        System.out.println(maxProfit(new int[] {7, 6, 4, 3, 1})); // 0
    }

    public static int maxProfit(int[] prices) {
        int count = 0;
        // 遍历
        for (int i = 1; i < prices.length; i++) {
            // 计算差值
            int temp = prices[i] - prices[i - 1];
            // 收益为正，累计
            if (temp > 0) {
                count += temp;
            }
        }
        return count;
    }
}
