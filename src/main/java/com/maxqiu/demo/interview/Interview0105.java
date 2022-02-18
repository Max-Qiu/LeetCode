package com.maxqiu.demo.interview;

/**
 * 面试题 01.05. 一次编辑
 *
 * https://leetcode-cn.com/problems/one-away-lcci/
 *
 * @author Max_Qiu
 */
public class Interview0105 {
    public static void main(String[] args) {
        System.out.println(oneEditAway("pale", "ple"));
        System.out.println(oneEditAway("pale", "pele"));
        System.out.println(oneEditAway("pale", "pea"));
        System.out.println(oneEditAway("pales", "pal"));
        System.out.println(oneEditAway("teacher", "taches"));
        System.out.println(oneEditAway("teacher", "bleacher"));
    }

    public static boolean oneEditAway(String first, String second) {
        // 先进行换位，将长的放在first
        if (first.length() < second.length()) {
            return oneEditAway(second, first);
        }
        // 如果长度差大于2，直接返回
        if (first.length() - second.length() > 1) {
            return false;
        }
        // 用于标记有不同字符的次数
        int hasDiff = 0;
        // 如果两个字符串长度相同
        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                // 如果两个字符不相同
                if (first.charAt(i) != second.charAt(i)) {
                    // 如果已有不同字符标记，则返回false
                    if (hasDiff > 0) {
                        return false;
                    }
                    // 做一个不同字符标记，继续比较后面的字符
                    else {
                        hasDiff++;
                    }
                }
            }
        }
        // 如果两个字符串长度不相同
        else {
            for (int i = 0; i < second.length(); i++) {
                // 如果两个字符相同
                if (first.charAt(i + hasDiff) != second.charAt(i)) {
                    // 如果已有不同字符标记，则返回false
                    if (hasDiff > 0) {
                        return false;
                    }
                    // 做一个不同字符标记，继续比较当前字符
                    else {
                        hasDiff++;
                        i--;
                    }
                }
            }
        }
        return true;
    }
}
