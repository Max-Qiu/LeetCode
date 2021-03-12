package com.maxqiu.demo.entity;

/**
 * 单向链表节点
 * 
 * @author Max_Qiu
 */
public class ListNode {
    /**
     * 值
     */
    public int val;

    /**
     * 下个节点
     */
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        String s = val + "";
        if (this.next != null) {
            s += "," + this.next.toString();
        }
        return s;
    }
}
