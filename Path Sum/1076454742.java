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

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        return hasPathSum1(root, targetSum);        
    }
    public boolean hasPathSum1(TreeNode root, int targetSum) {
        if (root == null){
            if (targetSum == 0) return true;
            return false;
        }
        if (root.left == null) return hasPathSum1(root.right, targetSum-root.val);
        if (root.right == null) return hasPathSum1(root.left, targetSum-root.val);

        return hasPathSum1(root.left, targetSum-root.val) || hasPathSum1(root.right, targetSum-root.val);        
    }
}