package com.maxqiu.demo.normal;

/**
 * 字符串中的单词数
 * 
 * https://leetcode-cn.com/problems/number-of-segments-in-a-string/
 * 
 * @author Max_Qiu
 */
public class Issue0434 {
    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
        System.out.println(countSegments(", , , ,        a, eaefa"));
    }

    public static int countSegments(String s) {
        // 空字符串
        if (s.length() == 0) {
            return 0;
        }
        // 定义单词数量
        int count = 0;
        // 定义上一个字符是否为字母
        boolean isWord = false;
        // 遍历字母
        String[] split = s.split("");
        for (String s1 : split) {
            // 如果是空格
            if (" ".equals(s1)) {
                // 且上一个字母
                if (isWord) {
                    // 单词数量加一
                    count++;
                    isWord = false;
                }
            }
            // 如果是字母
            else {
                // 且上一个字符是空格，修改标记
                if (!isWord) {
                    isWord = true;
                }
            }
        }
        // 遍历结束，如果标记为单词，则总量+1
        if (isWord) {
            count++;
        }
        return count;
    }
}
