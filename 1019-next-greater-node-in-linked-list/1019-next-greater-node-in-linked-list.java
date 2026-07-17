class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        int n = arr.size();
        int[] ans = new int[n];             
        Deque<Integer> st = new ArrayDeque<>(); 

        for (int i = 0; i < n; i++) {
            int curVal = arr.get(i);

            while (!st.isEmpty() && arr.get(st.peek()) < curVal) {
                int idx = st.pop();
                ans[idx] = curVal;
            }

            st.push(i);
        }

        return ans;
    }
}