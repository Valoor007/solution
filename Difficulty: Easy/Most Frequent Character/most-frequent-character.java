class Solution {
    public char getMaxOccuringChar(String s) {
    
    char[] sArr= s.toCharArray();
    Arrays.sort(sArr);
    
     int count =1;
    int max=1;
    
    char result =sArr[0];
    
    for(int i=0;i<s.length()-1;i++){
        if(sArr[i]==sArr[i+1]){
            count++;
        }else{
            count=1;
        }
        
        if(count>max){
            max=count;
            result=sArr[i];
        }
    }
    return result;
        
    }
}