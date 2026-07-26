class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
         HashMap<Integer,Integer> hm=new HashMap<>();
        
        for(int val:arr){
            hm.put(val,1);

            }
                        
ArrayList<Integer> ans=new ArrayList<>();
           for(int i=low;i<=high;i++){
            if(!hm.containsKey(i)){
                ans.add(i);
              }
        }
        return ans;
        
    }
}