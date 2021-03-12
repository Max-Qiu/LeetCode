package com.maxqiu.demo.normal;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 有效的括号
 * 
 * https://leetcode-cn.com/problems/valid-parentheses/
 * 
 * @author Max_Qiu
 */
public class Issue0020 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
        System.out.println(isValid("{"));
        System.out.println("=========================");
        System.out.println(isValid2("()"));
        System.out.println(isValid2("()[]{}"));
        System.out.println(isValid2("(]"));
        System.out.println(isValid2("([)]"));
        System.out.println(isValid2("{[]}"));
        System.out.println(isValid2("{"));
    }

    /**
     * 利用String的replace函数
     */
    public static boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        // 循环
        while (true) {
            int begin = s.length();
            // 字符串替换
            s = s.replace("()", "").replace("[]", "").replace("{}", "");
            int end = s.length();
            // 如果替换前与替换后长度不一致，说明替换成功，则再次执行
            if (begin == end) {
                break;
            }
        }
        return s.length() == 0;
    }

    /**
     * 使用栈
     */
    public static boolean isValid2(String s) {
        int n = s.length();
        // 长度为奇数，直接返回false
        if (n % 2 == 1) {
            return false;
        }
        // 初始化一个map，使用又括号作为键，左括号作为值
        Map<Character, Character> pairs = new HashMap<Character, Character>(3) {
            private static final long serialVersionUID = 7620979743159072567L;
            {
                put(')', '(');
                put(']', '[');
                put('}', '{');
            }
        };
        // 初始化一个栈（先进后出）
        Deque<Character> stack = new LinkedList<>();
        // 循环字符串
        for (int i = 0; i < n; i++) {
            // 取出字符
            char ch = s.charAt(i);
            // 判断是否为右括号
            if (pairs.containsKey(ch)) {
                // 如果栈为空，或者最后一个入栈的左括号和当前右括号对应的左括号不一致，则返回false
                if (stack.isEmpty() || !stack.peek().equals(pairs.get(ch))) {
                    return false;
                }
                // 否则最后一个左括号出栈
                stack.pop();
            } else {
                // 是左括号，则入栈
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
