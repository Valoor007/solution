class Solution {
    public int calPoints(String[] operations) {
        int n=operations.length;
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
        String op=operations[i];

          if(op.equals("C")){
            st.pop();
          }else if(op.equals("D")){
            st.push(st.peek()*2);
          }else if(op.equals("+")){
            int Last=st.pop();
            int secondLast=st.peek();
            st.push(Last);
            st.push(Last+secondLast);
          }else{
            st.push(Integer.parseInt(op));
          }

        }
        int sum=0;
        for(int i=0;i<st.size();i++){
             sum+=st.get(i);
        }
        return sum;
    }
}