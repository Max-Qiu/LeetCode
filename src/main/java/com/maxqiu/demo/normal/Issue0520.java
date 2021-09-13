package com.maxqiu.demo.normal;

/**
 * 520. 检测大写字母
 *
 * https://leetcode-cn.com/problems/detect-capital/
 *
 * @author Max_Qiu
 */
public class Issue0520 {
    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("FlaG"));
        System.out.println(detectCapitalUse("fffF"));
        System.out.println(detectCapitalUse("Flag"));
    }

    public static boolean detectCapitalUse(String word) {
        // a大写字母数量，b小写字母数量
        int a = 0, b = 0;
        // 遍历每个字母
        for (byte c : word.getBytes()) {
            // 分别累加
            if (c >= 65 && c <= 90) {
                a++;
            } else if (c >= 97 && c <= 122) {
                b++;
            } else {
                // 既不是大写字母，也不是小写字母，返回false
                return false;
            }
        }
        // 情况1：全是大写
        // 情况2：全是小写
        // 情况3：只有一个大写字母且首字母是大写
        return a == word.length() || b == word.length() || (a == 1 && word.charAt(0) <= 90);
    }
}
