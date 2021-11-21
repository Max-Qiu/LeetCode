package com.maxqiu.demo.normal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 682. 棒球比赛
 *
 * https://leetcode-cn.com/problems/baseball-game/
 *
 * @author Max_Qiu
 */
public class Issue0682 {
    public static void main(String[] args) {
        System.out.println(calPoints(new String[] {"5", "2", "C", "D", "+"}));
        System.out.println(calPoints(new String[] {"5", "-2", "4", "C", "D", "9", "+", "+"}));
    }

    public static int calPoints(String[] ops) {
        int count = 0;
        List<String> strings = new ArrayList<>(Arrays.asList(ops));
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            switch (s) {
                case "+":
                    // 计算前两次得分的和
                    int addPoint = Integer.parseInt(strings.get(i - 1)) + Integer.parseInt(strings.get(i - 2));
                    // 计入总数
                    count += addPoint;
                    // 并刷新当前位置
                    strings.set(i, addPoint + "");
                    break;
                case "D":
                    // 计算上一次得分的两倍
                    int dPoint = Integer.parseInt(strings.get(i - 1)) * 2;
                    // 计入总数
                    count += dPoint;
                    // 并刷新当前位置
                    strings.set(i, dPoint + "");
                    break;
                case "C":
                    // 前一次得分无效
                    count -= Integer.parseInt(strings.get(i - 1));
                    // 移除当前字符
                    strings.remove(i);
                    // 移除上一个字符（分数）
                    strings.remove(i - 1);
                    // 因为删除了两个字符，索引-2
                    i -= 2;
                    break;
                default:
                    // 其他情况，累加计算
                    count += Integer.parseInt(s);
            }
        }
        return count;
    }
}
