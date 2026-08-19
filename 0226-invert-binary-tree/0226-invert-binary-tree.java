class Solution {
    public TreeNode invertTree(TreeNode root) {

        if(root == null) return null;

        Queue<TreeNode> s = new LinkedList<>();

        s.add(root);

        while(!s.isEmpty()) {

            TreeNode node = s.remove();

            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;

            if(node.left != null) {
                s.add(node.left);
            }

            if(node.right != null) {
                s.add(node.right);
            }
        }

        return root;
    }
}