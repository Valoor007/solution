import java.util.HashMap;

class Solution {
    public int similarPairs(String[] words) {

        int count = 0;
        for (int i = 0; i < words.length; i++) {
            HashMap<Character, Integer> hm1 = new HashMap<>();

            char[] arr1 = words[i].toCharArray();

            for (char val : arr1) {
                hm1.put(val, 1);    
            }
            for (int j = i + 1; j < words.length; j++) {
                HashMap<Character, Integer> hm2 = new HashMap<>();
                char[] arr2 = words[j].toCharArray();
                for (char val : arr2) {
                    hm2.put(val, 1);
                }
                if (hm1.equals(hm2)) {
                    count++;
                }
            }
        }
        return count;
    }
}