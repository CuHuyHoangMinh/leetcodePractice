/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> a = new LinkedList<TreeNode>();
        a.add(root);
        String se = "";
        while (!a.isEmpty()){
            TreeNode cur = a.poll();
            if (cur == null){
                se = se + "NA!";
            } else{
                se = se+cur.val+"!";
                a.add(cur.left);
                a.add(cur.right);  
            }
                      
        }
        System.out.println(se);
        return se;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String [] st = data.split("!");
        Queue<TreeNode> a = new LinkedList<TreeNode>();
        if (st[0].equals("NA")) return null;
        TreeNode root = new TreeNode(Integer.parseInt(st[0]));
        a.add(root);
        int counter = 1;
        while (counter<st.length){
            TreeNode cur = a.poll();
            if (!st[counter].equals("NA")){
                TreeNode left = new TreeNode(Integer.parseInt(st[counter]));
                cur.left = left;
                a.add(left);
            }
            counter++;
            if (!st[counter].equals("NA")){
                TreeNode right = new TreeNode(Integer.parseInt(st[counter]));
                cur.right = right;
                a.add(right);
            }
            counter++;
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));