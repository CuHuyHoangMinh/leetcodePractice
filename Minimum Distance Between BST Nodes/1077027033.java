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
    
    int prev =-100001;
    int min = Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        if (root == null) {
            return 0;
        }
        minDiffInBST(root.left);
        int val = root.val - prev;
        if (val<min) min = val;
        prev = root.val;
        // System.out.println(root.val);
        minDiffInBST(root.right);
        
        return min;
        
    }
}