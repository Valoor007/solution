/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> ans =new ArrayList<>();
        Stack<Node> s= new Stack<>();
        
        Node node =root;
        
        while(!s.isEmpty()|| node!=null){
            
            while(node!=null){
                s.push(node);
                node=node.left;
            }
        node =s.pop();
        ans.add(node.data);
        
        node =node.right;
        }
                    return ans;

    }

}