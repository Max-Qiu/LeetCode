package com.maxqiu.demo.normal;

import java.util.Arrays;

/**
 * 492. 构造矩形
 *
 * https://leetcode-cn.com/problems/construct-the-rectangle/
 *
 * @author Max_Qiu
 */
public class Issue0492 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(4)));
        System.out.println(Arrays.toString(constructRectangle(5)));
        System.out.println(Arrays.toString(constructRectangle(6)));
        System.out.println(Arrays.toString(constructRectangle(7)));
        System.out.println(Arrays.toString(constructRectangle(8)));
        System.out.println(Arrays.toString(constructRectangle(9)));
    }

    public static int[] constructRectangle(int area) {
        for (int i = (int)Math.ceil(Math.sqrt(area)); i < area; i++) {
            if (area % i == 0) {
                return new int[] {i, area / i};
            }
        }
        return new int[] {area, 1};
    }
}
