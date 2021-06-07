package com.maxqiu.demo.normal;

import com.maxqiu.demo.entity.TreeNode;

/**
 * 左叶子之和
 * 
 * https://leetcode-cn.com/problems/sum-of-left-leaves/
 * 
 * @author Max_Qiu
 */
public class Issue0404 {
    public static void main(String[] args) {
        System.out.println(
            sumOfLeftLeaves(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.left != null) {
            sum += noChild(root.left) ? root.left.val : sumOfLeftLeaves(root.left);
        }
        if (root.right != null && !noChild(root.right)) {
            sum += sumOfLeftLeaves(root.right);
        }
        return sum;
    }

    public static boolean noChild(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
