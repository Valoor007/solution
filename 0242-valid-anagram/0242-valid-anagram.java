class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) {
    return false;
}
        HashMap<Character,Integer> hm=new HashMap<>();
         char[] sArr=s.toCharArray();
           char[] tArr=t.toCharArray();

           for(char val:sArr ){
            if(hm.containsKey(val)){
                int freq=hm.get(val);
                hm.put(val,freq+1);
            }else{
                 hm.put(val,1);
            }
           }

 for(char val:tArr){
    if(!hm.containsKey(val)|| hm.get(val)==0){
        return false;
    }
    hm.put(val,hm.get(val)-1);
 }
 return true;

    }
}