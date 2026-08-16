class Solution {
    public boolean isSymmetric(TreeNode root) {

        if(root == null) {
            return true;
        }

        if(root.left == null && root.right == null) {
            return true;
        }

        if(root.left == null || root.right == null) {
            return false;
        }

        Queue<TreeNode> q = new LinkedList<>();
        Queue<TreeNode> p = new LinkedList<>();

        TreeNode left = root.left;
        TreeNode right = root.right;

        if(left.val != right.val) {
            return false;
        }

        q.add(left);
        p.add(right);

        while(!q.isEmpty() && !p.isEmpty()) {

            TreeNode node1 = q.remove();
            TreeNode node2 = p.remove();

    if(node1.left == null && node2.right == null) {     
            }
         else if(node1.left == null || node2.right == null) {
                return false;
            }
            else if(node1.left.val != node2.right.val) {
                return false;
            }
         else {
                q.add(node1.left);
                p.add(node2.right);
            }


 if(node1.right == null && node2.left == null) {
                
            }
     else if(node1.right == null || node2.left == null) {
                return false;
            }
            else if(node1.right.val != node2.left.val) {
                return false;
            }
         else {
                q.add(node1.right);
                p.add(node2.left);
            }
        }

        return true;
    }
}