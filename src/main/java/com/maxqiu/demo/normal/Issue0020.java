package com.maxqiu.demo.normal;

/**
 * @author Max_Qiu
 */
public class Issue0020 {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
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

}
