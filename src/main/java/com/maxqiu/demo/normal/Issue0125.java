package com.maxqiu.demo.normal;

/**
 * 验证回文串
 * 
 * https://leetcode-cn.com/problems/valid-palindrome/
 * 
 * @author Max_Qiu
 */
public class Issue0125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(".,"));
        System.out.println(isPalindrome("a."));
    }

    public static boolean isPalindrome(String s) {
        // 新建一个StringBuilder
        StringBuilder sGood = new StringBuilder();
        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            // 获取字符
            char ch = s.charAt(i);
            // 判断是否为字符还是数字
            if (Character.isLetterOrDigit(ch)) {
                // 是，则拼接到StringBuilder中
                sGood.append(Character.toLowerCase(ch));
            }
        }
        // 拷贝一个StringBuilder，再调用翻转api
        StringBuilder sGoodRev = new StringBuilder(sGood).reverse();
        // 比较两个StringBuilder
        return sGood.toString().equals(sGoodRev.toString());
    }
}
