class Solution {

    ArrayList<int[]> nodes = new ArrayList<>();

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        ArrayList<List<Integer>> ans = new ArrayList<>();

        if(root == null) {
            return ans;
        }

        dfs(root, 0, 0);

        Collections.sort(nodes, (a, b) -> {

            // column
            if(a[1] != b[1]) {
                return a[1] - b[1];
            }

            // row
            if(a[0] != b[0]) {
                return a[0] - b[0];
            }

            // value
            return a[2] - b[2];
        });

        int col = Integer.MIN_VALUE;

        for(int[] node : nodes) {

            if(node[1] != col) {

                ans.add(new ArrayList<>());

                col = node[1];
            }

            ans.get(ans.size() - 1).add(node[2]);
        }

        return ans;
    }

    public void dfs(TreeNode root, int row, int column) {

        if(root == null) {
            return;
        }

        nodes.add(new int[]{row, column, root.val});

        dfs(root.left, row + 1, column - 1);

        dfs(root.right, row + 1, column + 1);
    }
}