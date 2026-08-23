/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        Stack<TreeNode> s = new Stack<>();
        HashMap<TreeNode, TreeNode> parent = new HashMap<>();
        s.push(root);
        parent.put(root, null);
        while(!s.isEmpty()) {
            TreeNode node = s.pop();
            if(node.left != null) {
                parent.put(node.left, node);
                s.push(node.left);
            }
  if(node.right != null) {
                parent.put(node.right, node);
                s.push(node.right);
            }
        }

 HashSet<TreeNode> set = new HashSet<>();
        while(p != null) {
            set.add(p);
            p = parent.get(p);
        }
        while(q != null) {
            if(set.contains(q)) {
                return q;
            }

            q = parent.get(q);
        }

        return null;
    }
}