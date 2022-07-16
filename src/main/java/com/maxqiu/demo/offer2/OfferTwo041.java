package com.maxqiu.demo.offer2;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 剑指 Offer II 041. 滑动窗口的平均值
 *
 * https://leetcode.cn/problems/qIsx9U/
 *
 * @author Max_Qiu
 */
public class OfferTwo041 {
    public static void main(String[] args) {
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(5));
        System.out.println(movingAverage.next(1));
    }

    static class MovingAverage {
        /**
         * 总和，直接使用double，计算除法时不需要类型转换
         */
        private double count = 0;

        /**
         * 总和
         */
        private int size;

        /**
         * 数据队列
         */
        private Deque<Integer> queue;

        public MovingAverage(int size) {
            this.size = size;
            queue = new ArrayDeque<>();
        }

        public double next(int val) {
            // 如果队列大小和总大小相当（也可以用>=），就弹出第一个元素，并在总和中减去
            if (queue.size() == size) {
                count -= queue.poll();
            }
            // 总和加入当前值
            count += val;
            // 队列加入当前值
            queue.add(val);
            // 计算平均数
            return count / queue.size();
        }
    }
}
