
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int val:a){
        if(hm.containsKey(val)){
            int freq=hm.get(val);
            hm.put(val,freq+1);
            }else{
            hm.put(val,1);
            }
        }
        for(int val:b){
            if(!hm.containsKey(val ) || hm.get(val) == 0){
                return false;
            }
            hm.put(val,hm.get(val)-1);
        }
        
        return true;
    }
}
