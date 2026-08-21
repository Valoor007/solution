class Solution {
    public int minDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        int hight = 0;

        q.add(root);
        while (!q.isEmpty()) {

            int size = q.size();
            hight++;
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove();
                if (node.left == null && node.right == null) {
                    return hight;
                }
             if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
        }

        return hight;
    }
}