package com.maxqiu.demo.normal;

/**
 * 495. 提莫攻击
 *
 * https://leetcode-cn.com/problems/teemo-attacking/
 *
 * @author Max_Qiu
 */
public class Issue0495 {
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[] {1, 4}, 2));
        System.out.println(findPoisonedDuration(new int[] {1, 2}, 2));
    }

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        // 得到攻击次数
        int n = timeSeries.length;
        // 如果未攻击，则返回0
        if (n == 0) {
            return 0;
        }
        // 定义总时间
        int total = 0;
        // 遍历前几次的攻击时间点
        for (int i = 0; i < n - 1; i++) {
            // 比较两次攻击时间点的间隔时长和中毒时长，取较小值，即当前攻击时间点会产生的伤害（有效的时长）
            total += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
        }
        // 最后返回前几次的攻击时长和最后一次的攻击时长（即单词伤害时长）
        return total + duration;
    }
}
