/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max  = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        pathSum(root);
        return max;
    }
    public int pathSum (TreeNode root) {
        if (root == null) return 0;
        int left = pathSum(root.left);
        int right = pathSum(root.right);
        if (root.val > max) max = root.val;
        if (root.val + left  > max) max = root.val + left ;
        if (root.val + right > max) max = root.val + right;
        if (root.val + left + right > max) max = root.val + left + right;
        // if (left > max) max = left;
        // if (right > max) max = right;
        return Integer.max(root.val + Integer.max(left,right),root.val);
        
    }
}