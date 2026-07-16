/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {

        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

    Stack<Integer> st= new Stack<>();
    int max=Integer.MIN_VALUE;
    for(int i=arr.size()-1;i>=0;i--){
            if(arr.get(i)>=max){
            st.push(arr.get(i));
            max=arr.get(i);
        }
    }
    ListNode dummy =new ListNode(-1);
    ListNode curr= dummy;

    while(!st.isEmpty()){
        curr.next = new ListNode(st.pop());
        curr=curr.next;
    }
        return dummy.next;
    }
}