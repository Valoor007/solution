class Solution {
    public int longestConsecutive(int[] arr) {
        
                if(arr.length == 0) return 0;

Arrays.sort(arr);
int count=1;
int max=1;

for(int i=0;i<arr.length-1;i++){

    if(arr[i]==arr[i+1]){
        continue;
    }
    
    int x= arr[i]+1;
    int y=arr[i+1];
    
    if(x==y){
        count++;
        max=Math.max(max,count);
    }else {
                count = 1;
    }
    
}
return max;
    }
}