package com.maxqiu.demo.normal;

import com.maxqiu.demo.entity.TreeNode;

/**
 * 将有序数组转换为二叉搜索树
 * 
 * https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 * 
 * @author Max_Qiu
 */
public class Issue0108 {
    public static void main(String[] args) {
        TreeNode treeNode1 = sortedArrayToBST(new int[] {-10, -3, 0, 5, 9});
        System.out.println(treeNode1);
        TreeNode treeNode2 = sortedArrayToBST(new int[] {1, 3});
        System.out.println(treeNode2);
        TreeNode treeNode3 = sortedArrayToBST(new int[] {0, 1, 2, 3, 4, 5});
        System.out.println(treeNode3);
    }

    /**
     * 官方解法
     * 
     * @param nums
     * @return
     */
    public static TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    /**
     * @param nums
     *            数组
     * @param left
     *            左索引
     * @param right
     *            右索引
     * @return
     */
    public static TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        // 总是选择中间位置左边的数字作为根节点
        int mid = (left + right) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        // 跟节点的左右节点继续递归
        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);
        return root;
    }
}
