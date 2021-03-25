package com.maxqiu.demo.normal;

import java.util.HashSet;

import com.maxqiu.demo.entity.ListNode;

/**
 * 相交链表
 * 
 * https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 * 
 * @author Max_Qiu
 */
public class Issue0160 {
    public static void main(String[] args) {
        ListNode pubNode = new ListNode(8, new ListNode(4, new ListNode(5)));
        System.out.println(getIntersectionNode(new ListNode(4, new ListNode(1, pubNode)),
            new ListNode(5, new ListNode(0, new ListNode(1, pubNode)))));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 存储对象
        HashSet<ListNode> set = new HashSet<>();
        // 先将 A 遍历并存入 set
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        // 再遍历 B
        while (headB != null) {
            // 如果可以存入 set 则继续遍历
            if (set.add(headB)) {
                headB = headB.next;
            }
            // 否则当前节点已在 set 中存在，即相较点，返回
            else {
                return headB;
            }
        }
        return null;
    }
}
