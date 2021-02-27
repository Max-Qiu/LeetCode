package com.maxqiu.demo.normal;

import java.util.Arrays;

/**
 * 加一
 * 
 * https://leetcode-cn.com/problems/plus-one/
 * 
 * @author Max_Qiu
 */
public class Issue0066 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[] {4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[] {0})));
        System.out.println(Arrays.toString(plusOne(new int[] {4, 3, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[] {9, 9})));
    }

    public static int[] plusOne(int[] digits) {
        // 获取最后一位的索引
        int index = digits.length - 1;
        // 如果当前索引大于0
        while (index >= 0) {
            // 如果当前位置的值大于等于9
            if (digits[index] >= 9) {
                // 则当前位置变为0
                digits[index] = 0;
                // 继续判断前一位
                index--;
            }
            // 如果当前位置的值小于9
            else {
                // 当前位置值+1
                digits[index] = digits[index] + 1;
                // 返回数组
                return digits;
            }
        }
        // 若索引小于0，即所有数字都为9，则创建新的数组，新数组比原数组长度大1
        digits = new int[digits.length + 1];
        // 因int数组默认为0，只需要修改第一位为1即可
        digits[0] = 1;
        // 返回数组
        return digits;
    }

}
