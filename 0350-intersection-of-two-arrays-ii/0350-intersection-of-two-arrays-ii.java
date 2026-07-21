
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int val : nums1) {
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int val : nums2) {
            if (hm.containsKey(val) && hm.get(val) > 0) {
                ans.add(val);
                hm.put(val, hm.get(val) - 1);
                if (hm.get(val) == 0) {
                    hm.remove(val);
                }
            }
        }

        int[] result = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }

        return result;
    }
}