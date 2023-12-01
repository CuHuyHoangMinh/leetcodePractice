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
    public List<Double> averageOfLevels(TreeNode root) {
        List<TreeNode> layer = new ArrayList<>();
        layer.add(root);
        List<Double> re = new ArrayList<>();
        while (layer.size()!=0){
            re.add(avgList(layer));
            layer = getChildList(layer);
        }
        return re;
    }

    public double avgList(List<TreeNode> layer){
        double re = 0;
        int count = 0;
        for (TreeNode i: layer){
            if (i!=null){
                re = re + i.val;
                count++;
            }
        }
        re = (double) re / (double) count;
        return re;
    }
    public List<TreeNode> getChildList(List<TreeNode> layer){
        List<TreeNode> re= new ArrayList<>();
        for (TreeNode i: layer){
            if (i.left != null) re.add(i.left);
            if (i.right != null) re.add(i.right);
        }
        return re;
    }
}