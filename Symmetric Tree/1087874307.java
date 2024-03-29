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
    public boolean isSymmetric(TreeNode root) {
        return isS(root.left,root.right);
    }

    public boolean isS(TreeNode l, TreeNode r){
        if (l == null && r == null) return true;
        if (l==null) return false;
        if (r == null) return false;
        if (l.val != r.val) return false;
        return isS(l.left,r.right) && isS(l.right,r.left);
    }
}