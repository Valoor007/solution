class Solution {
    void printNos(int n) {
        // code here
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
    }
}