package com.maxqiu.demo.normal;

/**
 * 557. 反转字符串中的单词 III
 *
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 *
 * @author Max_Qiu
 */
public class Issue0557 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest")); // s'teL ekat edoCteeL tsetnoc
    }

    public static String reverseWords(String s) {
        int start = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                reverse(chars, start, i - 1);
                start = i + 1;
            }
        }
        reverse(chars, start, chars.length - 1);
        return new String(chars);
    }

    /**
     * 翻转
     *
     * @param arr
     *            字母数组
     * @param left
     *            开始翻转位置
     * @param right
     *            结束翻转位置
     */
    public static void reverse(char[] arr, int left, int right) {
        while (left < right) {
            // 开始和结束对调位置
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            // 开始和结束分别+-1
            left++;
            right--;
        }
    }
}
