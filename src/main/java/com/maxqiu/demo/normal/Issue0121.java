package com.maxqiu.demo.normal;

/**
 * 买卖股票的最佳时机
 * 
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 
 * @author Max_Qiu
 */
public class Issue0121 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[] {7, 1, 5, 3, 6, 4})); // 5
        System.out.println(maxProfit(new int[] {7, 6, 4, 3, 1})); // 0
        System.out.println(maxProfit(new int[] {1, 2, 4})); // 3
        System.out.println(maxProfit(new int[] {6, 1, 3, 2, 4, 7})); // 6
        System.out.println(maxProfit(new int[] {2, 1, 4, 5, 2, 9, 7})); // 8
        System.out.println(maxProfit(new int[] {2, 1, 2, 1, 0, 1, 2})); // 2
        System.out.println(maxProfit(new int[] {1, 7, 2, 4})); // 6
        System.out.println(maxProfit(new int[] {2, 7, 1, 4, 11})); // 10
        System.out.println(maxProfit(new int[] {2, 5, 1, 3})); // 10
    }

    public static int maxProfit(int[] prices) {
        // 最大收益为0、最小值为最大值，
        int max = 0, min = Integer.MAX_VALUE;
        // 遍历
        for (int price : prices) {
            // 如果当前值小于最小值，刷新最小值
            if (price < min) {
                min = price;
                continue;
            }
            // 若当前值减去最小值比最大收益大，则刷新最大收益
            if (price - min > max) {
                max = price - min;
            }
        }
        return max;
    }
}
