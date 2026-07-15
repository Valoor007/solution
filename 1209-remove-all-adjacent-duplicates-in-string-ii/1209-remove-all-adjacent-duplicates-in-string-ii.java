class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        char[] stChar = new char[n];   
        int[] stCount = new int[n];    
        int top = -1;                  

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (top == -1) {
                top++;
                stChar[top] = ch;
                stCount[top] = 1;
                continue;
            }

            if (stChar[top] == ch) {
                stCount[top]++;              
                if (stCount[top] == k) {
                    top--;                  
                }
            } else {
                top++;
                stChar[top] = ch;
                stCount[top] = 1;
            }
        }

        int len = 0;
        for (int i = 0; i <= top; i++) len += stCount[i];

        char[] ans = new char[len];
        int idx = 0;
        for (int i = 0; i <= top; i++) {
            for (int j = 0; j < stCount[i]; j++) {
                ans[idx++] = stChar[i];
            }
        }
        return new String(ans);
    }
}