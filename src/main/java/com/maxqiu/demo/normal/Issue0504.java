package com.maxqiu.demo.normal;

/**
 * 504. 七进制数
 *
 * https://leetcode-cn.com/problems/base-7/
 *
 * @author Max_Qiu
 */
public class Issue0504 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
        System.out.println(convertToBase7(-7));
    }

    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean isNegative = false;
        if (num < 0) {
            isNegative = true;
            num = -num;
        }
        StringBuilder ans = new StringBuilder();
        do {
            ans.append(num % 7);
            num = num / 7;
        } while (num > 0);
        if (isNegative) {
            ans.append("-");
        }
        return ans.reverse().toString();
    }
}
