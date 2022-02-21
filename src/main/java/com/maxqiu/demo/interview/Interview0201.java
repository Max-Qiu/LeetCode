package com.maxqiu.demo.interview;

import java.util.HashSet;

import com.maxqiu.demo.entity.ListNode;

/**
 * 面试题 02.01. 移除重复节点
 *
 * https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
 *
 * @author Max_Qiu
 */
public class Interview0201 {
    public static void main(String[] args) {
        System.out
            .println(removeDuplicateNodes(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(1))))))));
    }

    public static ListNode removeDuplicateNodes(ListNode head) {
        // 当前节点为null，直接返回
        if (head == null) {
            return head;
        }
        HashSet<Integer> set = new HashSet<>();
        set.add(head.val);
        // 获取当前节点
        ListNode pod = head;
        // 若下个节点有值，循环遍历
        while (pod.next != null) {
            // 若下个节点的值可以加入集合
            if (set.add(pod.next.val)) {
                // 则获取下个节点
                pod = pod.next;
            } else {
                // 否则删除下个节点，跳到下下个
                pod.next = pod.next.next;
            }
        }
        return head;
    }
}
