package com.maxqiu.demo.normal;

/**
 * 外观数列
 * 
 * https://leetcode-cn.com/problems/count-and-say/
 * 
 * @author Max_Qiu
 */
public class Issue0038 {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(countAndSay(i));
        }
    }

    // 1. 1
    // 2. 11
    // 3. 21
    // 4. 1211
    // 5. 111221
    // 6. 312211
    // 7. 13112221
    // 8. 1113213211
    // 9. 31131211131221
    // 10. 13211311123113112211
    public static String countAndSay(int n) {
        // 初始值为1
        StringBuilder str = new StringBuilder("1");
        // 从第二层开始循环
        for (int i = 2; i <= n; i++) {
            // 将初始值转换为数组
            String[] split = str.toString().split("");
            // 将初始值清空，用于记录新字符串
            str = new StringBuilder();
            // cou 用于记录这个字符出现了多少次
            int cou = 1;
            // last 用于记录上一个字符
            String last = null;
            // 遍历初始值的每一个字符
            for (String s : split) {
                // 如果上一个字符为空，则为第一个字符
                if (last == null) {
                    last = s;
                }
                // 如果和上一个字符相同
                else if (last.equals(s)) {
                    // 则当前字符的计数+1
                    cou++;
                }
                // 如果和上一个字符不相同
                else {
                    // 新字符串拼接上一个字符的数量和字符
                    str.append(cou).append(last);
                    // 拼接后重置数量并记录当前字符
                    cou = 1;
                    last = s;
                }
            }
            // 新字符串拼接上一个字符的数量和字符
            str.append(cou).append(last);
        }
        // 返回新字符串
        return str.toString();
    }
}
