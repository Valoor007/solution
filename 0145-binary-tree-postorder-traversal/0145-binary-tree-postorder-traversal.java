class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();

        if(root == null) return ans;

        s.push(root);

        while(!s.isEmpty()) {

            TreeNode node = s.pop();

            ans.add(node.val);

            if(node.left != null) {
                s.push(node.left);
            }

            if(node.right != null) {
                s.push(node.right);
            }
        }

        Collections.reverse(ans);

        return ans;
    }
}