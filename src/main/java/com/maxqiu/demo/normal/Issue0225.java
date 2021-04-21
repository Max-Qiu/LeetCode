package com.maxqiu.demo.normal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 用队列实现栈
 * 
 * https://leetcode-cn.com/problems/implement-stack-using-queues/
 * 
 * @author Max_Qiu
 */
public class Issue0225 {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.empty());
    }

    static class MyStack {
        Queue<Integer> queue1;
        Queue<Integer> queue2;

        /** Initialize your data structure here. */
        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        /** Push element x onto stack. */
        public void push(int x) {
            // 将元素加入队列2
            queue2.offer(x);
            // 如果队列1的元素不为空，则将队列1的元素取出放入队列2
            while (!queue1.isEmpty()) {
                queue2.offer(queue1.poll());
            }
            // 交还队列1 2
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            return queue1.poll();
        }

        /** Get the top element. */
        public int top() {
            return queue1.peek();
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue1.isEmpty();
        }
    }
}
