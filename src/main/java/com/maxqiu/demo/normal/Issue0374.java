package com.maxqiu.demo.normal;

/**
 * 猜数字大小
 * 
 * https://leetcode-cn.com/problems/guess-number-higher-or-lower/
 * 
 * @author Max_Qiu
 */
public class Issue0374 {
    public static void main(String[] args) {
        Solution solution = new Solution(6);
        System.out.println(solution.guessNumber(10));
    }

    static class Solution extends GuessGame {
        public int guessNumber(int n) {
            // 开始区间为1；
            int begin = 1;
            // 当开始区间小于结束区间
            while (begin <= n) {
                // 计算二分数
                int half = begin + (n - begin) / 2;
                // 判断二分数的猜测结果
                int result = guess(half);
                // 猜中返回
                if (result == 0) {
                    return half;
                }
                // 猜小了
                else if (result > 0) {
                    // 则将开始区间移到二分数+1
                    begin = half + 1;
                }
                // 猜大了
                else {
                    // 将结束区间移到二分数-1
                    n = half - 1;
                }
            }
            return -1;
        }

        public Solution(int pick) {
            super(pick);
        }
    }

    static class GuessGame {
        // 目标数字
        int pick;

        /**
         * 判断猜测的大小
         * 
         * @param num
         *            猜测的数字
         * @return 0 相等<br>
         *         1 猜的数字比目标数字小<br>
         *         -1 猜的数字比目标数字大
         * 
         */
        int guess(int num) {
            if (num == pick) {
                return 0;
            }
            return num < pick ? 1 : -1;
        }

        /**
         * 初始化目标数字
         * 
         * @param pick
         */
        public GuessGame(int pick) {
            this.pick = pick;
        }
    }
}
