package com.maxqiu.demo.normal;

import com.maxqiu.demo.entity.TreeNode;

/**
 * 平衡二叉树
 * 
 * https://leetcode-cn.com/problems/balanced-binary-tree/
 * 
 * @author Max_Qiu
 */
public class Issue0110 {
    public static void main(String[] args) {
        System.out
            .println(isBalanced(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        System.out.println(isBalanced(new TreeNode(1,
            new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2))));
        System.out.println(isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), null), null),
            new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4))))));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 左节点的总层数
        int left = countLevel(root.left, 1);
        // 右节点的总层数
        int right = countLevel(root.right, 1);
        // 左右节点的总层数差不超过1 && 左节点的子节点左右层数不超过1 && 右节点的左右层数不超过1
        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    /**
     * 计算当前节点总层数
     * 
     * @param node
     *            节点
     * @param level
     *            层数
     * @return
     */
    public static int countLevel(TreeNode node, int level) {
        // 如果当前节点不存在，返回层数减一
        if (node == null) {
            return level - 1;
        }
        // 若当前层没有子节点，返回当前层数
        if (node.left == null && node.right == null) {
            return level;
        }
        // 有子节点，层数+1
        level++;
        // 返回左右子节点递归层数的最大层数
        return Math.max(countLevel(node.left, level), countLevel(node.right, level));
    }
}
