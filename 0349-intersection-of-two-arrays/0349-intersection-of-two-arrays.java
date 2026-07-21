class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int val:nums1){
            hm.put(val,1);
        } 
        ArrayList<Integer> ans =new ArrayList<>();
        
        for(int val:nums2){
            if(hm.containsKey(val)){
                ans.add(val);
                hm.remove(val);
            }
        }

        int[] res= new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }

        return res;
    }
}