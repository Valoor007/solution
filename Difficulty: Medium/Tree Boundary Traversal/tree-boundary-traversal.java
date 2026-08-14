class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if(root == null)
            return ans;

        // root
        ans.add(root.data);

        // single node
        if(root.left == null && root.right == null)
            return ans;

        // left boundary
        Node node = root.left;

        while(node != null) {

            if(node.left == null && node.right == null)
                break;

            ans.add(node.data);

            if(node.left != null)
                node = node.left;
            else
                node = node.right;
        }

        // leaf nodes
        addLeaves(root.left, ans);
        addLeaves(root.right, ans);

        // right boundary
        ArrayList<Integer> ansss = new ArrayList<>();

        node = root.right;

        while(node != null) {

            if(node.left == null && node.right == null)
                break;

            ansss.add(node.data);

            if(node.right != null)
                node = node.right;
            else
                node = node.left;
        }

        Collections.reverse(ansss);

        ans.addAll(ansss);

        return ans;
    }

    public void addLeaves(Node root, ArrayList<Integer> ans) {

        if(root == null)
            return;

        if(root.left == null && root.right == null) {
            ans.add(root.data);
            return;
        }

        addLeaves(root.left, ans);
        addLeaves(root.right, ans);
    }
}