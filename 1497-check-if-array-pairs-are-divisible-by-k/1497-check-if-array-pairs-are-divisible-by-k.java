import java.util.HashMap;

class Solution {
    public boolean canArrange(int[] arr, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int val : arr) {

            int rem = val % k;

            if (rem < 0) {
                rem += k;
            }

            if (hm.containsKey(rem)) {
                int freq = hm.get(rem);
                hm.put(rem, freq + 1);
            } else {
                hm.put(rem, 1);
            }
        }
        for (int rem : hm.keySet()) {

            int freq = hm.get(rem);

            if (rem == 0) {

                if (freq % 2 != 0) {
                    return false;
                }

            } else {

                int need = k - rem;

                if (hm.containsKey(need)) {

                    if (hm.get(need) != freq) {
                        return false;
                    }

                } else {
                    return false;
                }
            }
        }

        return true;
    }
}