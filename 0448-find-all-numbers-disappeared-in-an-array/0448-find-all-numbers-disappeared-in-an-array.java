class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int val : arr){
            hm.put(val,1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 1; i <= arr.length; i++){
            if(!hm.containsKey(i)){
                ans.add(i);
            }
        }

     return ans;
    }
}