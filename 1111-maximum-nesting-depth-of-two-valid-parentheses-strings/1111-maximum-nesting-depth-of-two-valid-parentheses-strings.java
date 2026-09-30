class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int a[]=new int [n];
        int x=0;
        for(int i=0;i<n;i++){
            char c = seq.charAt(i);
            if(c=='('){
                a[i]=(x++)%2;
            }else a[i]=(--x)%2;
        }return a;
    }
}