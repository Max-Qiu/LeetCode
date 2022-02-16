package com.maxqiu.demo.interview;

/**
 * 面试题 01.03. URL化
 *
 * https://leetcode-cn.com/problems/string-to-url-lcci/
 *
 * @author Max_Qiu
 */
public class Interview0103 {
    public static void main(String[] args) {
        System.out.println(replaceSpaces("Mr John Smith    ", 13));
        System.out.println(replaceSpaces("               ", 5));
        System.out.println(replaceSpaces("ds sdfs afs sdfa dfssf asdf", 27));
    }

    public static String replaceSpaces(String s, int length) {
        StringBuilder stringBuilder = new StringBuilder();
        // 逐渐遍历字符串
        for (int i = 0; i < length; i++) {
            // 如果不是空格就加入到StringBuilder中，如果是空格
            // 就把"%20"加入到StringBuilder中
            char ch = s.charAt(i);
            if (ch == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
