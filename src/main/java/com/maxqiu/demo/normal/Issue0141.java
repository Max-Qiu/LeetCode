package com.maxqiu.demo.normal;

import java.util.HashSet;

import com.maxqiu.demo.entity.ListNode;

/**
 * 环形链表
 * 
 * https://leetcode-cn.com/problems/linked-list-cycle/
 *
 * @author Max_Qiu
 */
public class Issue0141 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3)));
        System.out.println(hasCycle1(node));
        System.out.println(hasCycle2(node));

        ListNode cycleNode1 = new ListNode(2);
        cycleNode1.next = new ListNode(0, new ListNode(-4, cycleNode1));
        ListNode rootNode1 = new ListNode(3, cycleNode1);
        System.out.println(hasCycle1(rootNode1));
        System.out.println(hasCycle2(rootNode1));

        ListNode cycleNode2 = new ListNode(2);
        cycleNode2.next = new ListNode(2, cycleNode2);
        System.out.println(hasCycle1(cycleNode2));
        System.out.println(hasCycle2(cycleNode2));
    }

    /**
     * Hash表方法
     * 
     * @return
     */
    public static boolean hasCycle1(ListNode head) {
        // 新建一个 HashSet存储节点
        HashSet<ListNode> set = new HashSet<>();
        // 若当前节点不为空
        while (head != null) {
            // 添加成功取反即添加失败，说明set中有重复元素，返回true
            if (!set.add(head)) {
                return true;
            }
            // 添加成功，继续下一个节点
            head = head.next;
        }
        return false;
    }

    /**
     * Hash表方法
     *
     * @return
     */
    public static boolean hasCycle2(ListNode head) {
        // 先判断前两个节点
        if (head == null || head.next == null) {
            return false;
        }
        // 慢节点取第一个节点
        ListNode slowNode = head;
        // 快节点取第二个节点
        ListNode fastNode = head.next;
        // 如果两个节点不相等（hashCode）
        while (slowNode != fastNode) {
            // 如果快节点的下一个节点或者下下个节点为空，说明没有环
            if (fastNode.next == null || fastNode.next.next == null) {
                return false;
            }
            // 慢节点前进一格
            slowNode = slowNode.next;
            // 快节点前进两格
            fastNode = fastNode.next.next;
        }
        // 若有环，最后快节点会追上慢节点，此时 slowNode == fastNode
        return true;
    }
}
