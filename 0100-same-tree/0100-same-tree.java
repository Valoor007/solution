class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<TreeNode> q0 = new LinkedList<>();
        Queue<TreeNode> q1 = new LinkedList<>();

        q0.add(p);
        q1.add(q);

        while(!q0.isEmpty()) {

            TreeNode node0 = q0.remove();
            TreeNode node1 = q1.remove();

            if(node0 == null && node1 == null){
                continue;
            }

            if(node0 == null || node1 == null){
                return false;
            }

            if(node0.val != node1.val){
                return false;
            }

            q0.add(node0.left);
            q1.add(node1.left);

            q0.add(node0.right);
            q1.add(node1.right);
        }

        return true;
    }
}