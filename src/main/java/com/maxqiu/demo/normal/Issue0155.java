package com.maxqiu.demo.normal;

import java.util.ArrayList;

/**
 * 最小栈
 * 
 * https://leetcode-cn.com/problems/min-stack/submissions/
 * 
 * @author Max_Qiu
 */
public class Issue0155 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin()); // -3
        minStack.pop();
        System.out.println(minStack.top()); // 0
        System.out.println(minStack.getMin()); // -2
    }

    static class MinStack {
        private int min;
        ArrayList<Integer> valueList;
        ArrayList<Integer> minList;

        public MinStack() {
            min = Integer.MAX_VALUE;
            valueList = new ArrayList<>();
            minList = new ArrayList<>();
        }

        /**
         * 入栈
         */
        public void push(int val) {
            valueList.add(val);
            if (val < min) {
                min = val;
            }
            minList.add(min);
        }

        /**
         * 出栈（栈顶元素）
         */
        public void pop() {
            if (valueList.size() == 0) {
                return;
            }
            valueList.remove(valueList.size() - 1);
            minList.remove(minList.size() - 1);
            if (minList.size() == 0) {
                min = Integer.MAX_VALUE;
                return;
            }
            min = minList.get(minList.size() - 1);
        }

        /**
         * 获取栈顶元素
         */
        public int top() {
            return valueList.get(valueList.size() - 1);
        }

        /**
         * 获取栈内最小元素
         */
        public int getMin() {
            return min;
        }
    }
}
