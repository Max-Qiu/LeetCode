package com.maxqiu.demo.normal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 杨辉三角 II
 * 
 * https://leetcode-cn.com/problems/pascals-triangle-ii/
 * 
 * @author Max_Qiu
 */
public class Issue0119 {
    public static void main(String[] args) {
        // 杨辉三角1 传入的层的数量
        System.out.println(Issue0118.generate(4).get(3));
        // 杨辉三角2 传入的层的索引
        System.out.println(getRow(0));
        System.out.println(getRow(1));
        System.out.println(getRow(2));
        System.out.println(getRow(3));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> lastList = Collections.singletonList(1);
        // 循环生产，i代表当前是i层，即第i+1个（索引为1，层数为2）
        for (int i = 1; i <= rowIndex; i++) {
            // 新建当前list
            List<Integer> list = new ArrayList<>();
            // 添加头
            list.add(1);
            // 第二个元素开始，至倒数第二个元素结束
            for (int j = 1; j < i; j++) {
                // 取上一层当前位置元素和上一层当前位置-1的元素 并求和
                list.add(lastList.get(j) + lastList.get(j - 1));
            }
            // 添加尾
            list.add(1);
            // 添加进大集合
            lastList = list;
        }
        return lastList;
    }
}
