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

                if (root == null) return false;

        Stack<TreeNode> s= new Stack<>();
        Stack<Integer> sums= new Stack<>();

        s.push(root);
        sums.push(root.val);

        while(!s.isEmpty()){            
            TreeNode node =s.pop();
          int sum=sums.pop();

        if(node.left==null&&node.right==null){
            if(sum==targetSum){
                return true;
            }
        }

            if(node.left!=null){
                s.push(node.left);
               sums.push(sum+node.left.val);
            }
            if(node.right!=null){
                s.push(node.right);
               sums.push(sum+node.right.val);
            }
        }
 return false;       
    }
}