package com.maxqiu.demo.interview;

import java.util.Arrays;

/**
 * 面试题 10.01. 合并排序的数组
 *
 * https://leetcode-cn.com/problems/sorted-merge-lcci/
 *
 * @author Max_Qiu
 */
public class Interview1001 {
    public static void main(String[] args) {
        int[] a1 = new int[] {1, 2, 3, 0, 0, 0};
        merge(a1, 3, new int[] {2, 5, 6}, 3);
        System.out.println(Arrays.toString(a1));

        int[] a2 = new int[] {0};
        merge(a2, 0, new int[] {1}, 1);
        System.out.println(Arrays.toString(a2));
    }

    /**
     * 从后往前覆盖方式
     */
    public static void merge(int[] a, int m, int[] b, int n) {
        // 被覆盖的索引
        int curr = a.length - 1;
        // a 数组的最后一个元素的索引
        m--;
        // b 数组的最后一个元素的索引
        n--;
        // 由后向前，直至全部覆盖完成
        while (curr >= 0) {
            // 如果 a 数组已经便利结束
            if (m < 0) {
                // 则当前位置直接取 b 数组的元素
                a[curr] = b[n];
                // b 数组索引 -1
                n--;
            }
            // 同上
            else if (n < 0) {
                a[curr] = a[m];
                m--;
            }
            // a b 数组都没比较完的情况，哪个大取哪个，相应索引 -1
            else if (a[m] > b[n]) {
                a[curr] = a[m];
                m--;
            } else {
                a[curr] = b[n];
                n--;
            }
            // 被覆盖索引-1
            curr--;
        }
    }
}
