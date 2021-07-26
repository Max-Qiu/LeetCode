package com.maxqiu.demo.normal;

/**
 * 441. 排列硬币
 * 
 * https://leetcode-cn.com/problems/arranging-coins/
 * 
 * @author Max_Qiu
 */
public class Issue0441 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(1));
        System.out.println(arrangeCoins(5));
        System.out.println(arrangeCoins(8));
        System.out.println(arrangeCoins(100));
    }

    public static int arrangeCoins(int n) {
        // 层数，也代表每一层需要的棋子数
        int count = 1;
        // 如果总棋子数大于等于当前层需要的棋子数
        while (n >= count) {
            // 总棋子数减去当前层的棋子数
            n = n - count;
            // 层数加1
            count++;
        }
        // 当棋子数不够时，返回层数-1
        return count - 1;
    }
}
