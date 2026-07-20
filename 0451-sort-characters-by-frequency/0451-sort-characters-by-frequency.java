class Solution {
    public String frequencySort(String s) {
        int max = 0;
        for (char ch : s.toCharArray()) {
            if(ch > max){
                max = ch;
            }
        }
        
        int[] freqarr = new int[max + 1];
        for (int i = 0; i < s.length(); i++) {
            freqarr[s.charAt(i)]++;
        }
        
        String ans = "";

    while(true){

        int maxFreq = 0;
        int ch = -1;

        for(int i = 0; i <= max; i++){
            if(freqarr[i] > maxFreq){
                maxFreq = freqarr[i];
                ch = i;
            }
        }

        if(maxFreq == 0){
            break;
        }

        while(freqarr[ch] > 0){
            ans += (char)ch;
            freqarr[ch]--;
        }
    }

    return ans;
    }
}