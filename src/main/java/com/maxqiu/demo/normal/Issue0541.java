package com.maxqiu.demo.normal;

/**
 * 541. 反转字符串 II
 *
 * https://leetcode-cn.com/problems/reverse-string-ii/
 *
 * @author Max_Qiu
 */
public class Issue0541 {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2)); // bacdfeg
        System.out.println(reverseStr("abcd", 2)); // bacd
    }

    public static String reverseStr(String s, int k) {
        int n = s.length();
        // 拆分成字母
        char[] arr = s.toCharArray();
        // 遍历，并且每次都跳2k个位置
        for (int i = 0; i < n; i += 2 * k) {
            // 条件1：剩余字符小于k个，则此时 i+k>n，则取到n
            // 条件2：剩余字符小于2k 但大于或等于k个，此时 i+k<=n，则取到i+k
            // 最后索引为长度-1
            reverse(arr, i, Math.min(i + k, n) - 1);
        }
        return new String(arr);
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
