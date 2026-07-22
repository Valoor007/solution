class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> hm= new HashMap<>();

        for(int val:nums1){
            if(hm.containsKey(val)){
                int of=hm.get(val);
                int nf=of+1;
                hm.put(val,nf);
            }else{
                hm.put(val,1);
            }
        }

                ArrayList<Integer> ans = new ArrayList<>();

        for(int val:nums2){
            if(hm.containsKey(val)&& hm.get(val)>0){
                ans.add(val);

                int of=hm.get(val);
                int nf=of-1;
                hm.put(val,nf);
            }
        }
            int[] res = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    

    }
}