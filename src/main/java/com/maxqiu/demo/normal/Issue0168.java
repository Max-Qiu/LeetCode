package com.maxqiu.demo.normal;

/**
 * Excel表列名称
 * 
 * https://leetcode-cn.com/problems/excel-sheet-column-title/
 * 
 * @author Max_Qiu
 */
public class Issue0168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1)); // A
        System.out.println(convertToTitle(28)); // AB
        System.out.println(convertToTitle(701)); // ZY
        System.out.println(convertToTitle(702)); // ZZ
        System.out.println(convertToTitle(703)); // AAA
        System.out.println(convertToTitle(2147483647)); // FXSHRXW
    }

    public static String convertToTitle(int columnNumber) {
        // 余数对应的字母，特殊的，26于0对应Z
        char[] chars = new char[] {'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y'};
        StringBuilder s = new StringBuilder();
        // 如果这个数大于26，说明有进位
        while (columnNumber > 26) {
            // 取余数
            int temp = columnNumber % 26;
            // 放在第一个字符
            s.insert(0, chars[temp]);
            // 判断是否为整除
            temp = temp == 0 ? 26 : temp;
            // 去掉余数再除以26
            columnNumber = (columnNumber - temp) / 26;
        }
        // 最后再插入一个数
        s.insert(0, columnNumber == 26 ? chars[0] : chars[columnNumber]);
        return s.toString();
    }
}
