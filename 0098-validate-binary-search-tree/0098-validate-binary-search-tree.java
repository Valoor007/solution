class Solution {

    public boolean isValidBST(TreeNode root) {

        Stack<TreeNode> s = new Stack<>();

        TreeNode node = root;
        long prev = Long.MIN_VALUE;

        while(node != null || !s.isEmpty()) {

            while(node != null) {
                s.add(node);
                node = node.left;
            }

            node = s.pop();

            if(node.val <= prev)
                return false;

            prev = node.val;

            node = node.right;
        }

        return true;
    }
}
