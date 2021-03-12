package com.maxqiu.demo.normal;

import com.maxqiu.demo.entity.TreeNode;

/**
 * 二叉树的最大深度
 * 
 * https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
 * 
 * @author Max_Qiu
 */
public class Issue0104 {
    public static void main(String[] args) {
        // [3,9,20,null,null,15,null]
        System.out.println(maxDepth(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), null))));
    }

    public static int maxDepth(TreeNode root) {
        return check(root, 1);
    }

    /**
     * 检查节点
     * 
     * @param node
     *            当前节点
     * @param level
     *            当前层数
     * @return
     */
    public static int check(TreeNode node, int level) {
        // 当前节点为空，说明当前节点不存在
        if (node == null) {
            // 返回当前层数-1
            return level - 1;
        }
        // 若没有子节点
        if (node.left == null && node.right == null) {
            // 返回当前层数
            return level;
        }
        // 有子节点，层数+1
        level++;
        // 返回左节点与右节点递归后的最大层数
        return Math.max(check(node.left, level), check(node.right, level));
    }
}
