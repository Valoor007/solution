class Solution {
    public int missingNumber(int[] nums) {

                HashMap<Integer, Integer> hm = new HashMap<>();

                for(int val:nums){
                    hm.put(val,1);
                }
                for(int i=0;i<=nums.length;i++){
                    if(!hm.containsKey(i)){
                            return i;
                    }
                }
                return -1;
    }
}