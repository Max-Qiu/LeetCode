package com.maxqiu.demo.normal;

/**
 * 对称二叉树
 * 
 * https://leetcode-cn.com/problems/symmetric-tree/
 * 
 * @author Max_Qiu
 */
public class Issue0101 {

    public static void main(String[] args) {
        System.out.println(isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)),
            new TreeNode(2, new TreeNode(4), new TreeNode(3)))));
        System.out.println(isSymmetric(
            new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3)))));
    }

    public static boolean isSymmetric(TreeNode root) {
        // 去掉根节点，遍历左右节点
        return check(root.left, root.right);
    }

    public static boolean check(TreeNode p, TreeNode q) {
        // 左右节点均为null
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        // 左右节点的值相等 && 左节点的左节点等于右节点的右节点 && 左节点的右节点等于右节点的左节点
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

    /**
     * 二叉树节点
     */
    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
