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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans= new ArrayList<>();
        Stack<TreeNode> s= new Stack<TreeNode>();
        
    while(!s.isEmpty()||root!=null){
       
       while(root!=null){
        s.push(root);
        root=root.left;
          }

          TreeNode node=s.pop();
          ans.add(node.val);

          root=node.right;

        }
        return ans;
    }
}