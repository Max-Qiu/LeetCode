package com.maxqiu.demo.normal;

/**
 * 551. 学生出勤记录 I
 *
 * https://leetcode-cn.com/problems/student-attendance-record-i/
 *
 * @author Max_Qiu
 */
public class Issue0551 {
    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP"));
        System.out.println(checkRecord("PPALLL"));
    }

    public static boolean checkRecord(String s) {
        // 定义 A 和 L 的次数
        int a = 0, l = 0;
        // 遍历字符串
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'L':
                    // 如果 L 迟到，次数+1
                    l++;
                    // 不满足条件，直接返回false
                    if (l >= 3) {
                        return false;
                    }
                    break;
                case 'A':
                    // 如果是 A 缺勤，次数+1
                    a++;
                    // 不满足条件，直接返回false
                    if (a >= 2) {
                        return false;
                    }
                default:
                    // 非 L 迟到的情况，重置连续次数
                    l = 0;
            }
        }
        return true;
    }
}
