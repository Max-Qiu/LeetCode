package com.maxqiu.demo.normal;

/**
 * Excel表列序号
 * 
 * https://leetcode-cn.com/problems/excel-sheet-column-number/
 * 
 * @author Max_Qiu
 */
public class Issue0171 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("A")); // 1
        System.out.println(titleToNumber("AB")); // 28
        System.out.println(titleToNumber("ZY")); // 701
        System.out.println(titleToNumber("ZZ")); // 702
        System.out.println(titleToNumber("AAA")); // 703
        System.out.println(titleToNumber("FXSHRXW")); // 2147483647
    }

    public static int titleToNumber(String columnTitle) {
        // 转换为 byte
        byte[] bytes = columnTitle.getBytes();
        // 总数
        int temp = 0;
        // 遍历
        for (byte b : bytes) {
            temp = temp * 26 + (b - 64);
        }
        return temp;
    }
}
