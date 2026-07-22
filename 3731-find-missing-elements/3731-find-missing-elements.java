class Solution {
    public List<Integer> findMissingElements(int[] arr) {

        Arrays.sort(arr);

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {

            int curr = arr[i];
            int next = arr[i + 1];

            while (curr + 1 < next) {
                curr++;
                ans.add(curr);
            }
        }

        return ans;
    }
}
