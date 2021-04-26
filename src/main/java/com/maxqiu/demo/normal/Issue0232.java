package com.maxqiu.demo.normal;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 用栈实现队列
 * 
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 * 
 * @author Max_Qiu
 */
public class Issue0232 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }

    static class MyQueue {
        Deque<Integer> inDeque;
        Deque<Integer> outDeque;

        public MyQueue() {
            inDeque = new LinkedList<>();
            outDeque = new LinkedList<>();
        }

        public void push(int x) {
            // 加入元素
            inDeque.push(x);
        }

        public int pop() {
            // 如果outDeque是空的
            if (outDeque.isEmpty()) {
                in2out();
            }
            // 经过转换后，outDeque的最后一个元素就是最开始放进去的元素
            return outDeque.pop();
        }

        public int peek() {
            // 同理
            if (outDeque.isEmpty()) {
                in2out();
            }
            return outDeque.peek();
        }

        public boolean empty() {
            return inDeque.isEmpty() && outDeque.isEmpty();
        }

        /**
         * 输入栈放入输出栈
         */
        private void in2out() {
            // 当inDeque不为空，那就inDeque出栈并放入outDeque
            // 即 inDeque:1,2 outDeque:null -> inDeque:null outDeque:2,1
            while (!inDeque.isEmpty()) {
                outDeque.push(inDeque.pop());
            }
        }
    }
}
