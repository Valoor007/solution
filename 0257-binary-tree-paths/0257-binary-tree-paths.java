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
    public List<String> binaryTreePaths(TreeNode root) {
         List<String> L= new ArrayList<>();

         if(root==null){
            return L;
         }

        Queue<TreeNode> q = new LinkedList<>();
        Queue<String> path = new LinkedList<>();

            q.add(root);
            path.add(""+root.val);

            while(!q.isEmpty()){
                TreeNode node= q.remove();
            String p=path.remove();

                if(node.left==null&&node.right==null){
                    L.add(p);
                }

            if(node.left!=null){
                q.add(node.left);
                path.add(p+"->"+node.left.val);
            }
            if(node.right!=null){
                q.add(node.right);
             path.add(p+"->"+node.right.val);
            }

            }
                         return L;

    }
}