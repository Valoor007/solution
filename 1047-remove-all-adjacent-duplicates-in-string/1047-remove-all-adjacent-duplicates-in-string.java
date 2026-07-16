class Solution {
    public String removeDuplicates(String s) {

        Stack<Character> st= new Stack<>();
        Stack<Character> st1= new Stack<>();
int i=0;
while(i<s.length()){
            char ch=s.charAt(i);

            if(st.empty()||st.peek()!=ch){
                st.push(ch);
            }else {
                st.pop();
            }
            i++;
        }

        char[] ans =new char[st.size()];
        for(int j=0;j<ans.length;j++){
            ans[j]=st.get(j);
        }
        return new String(ans);
    }
}