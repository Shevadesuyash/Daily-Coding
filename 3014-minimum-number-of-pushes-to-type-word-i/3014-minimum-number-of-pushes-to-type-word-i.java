class Solution {
    public int minimumPushes(String word) {
        int l=word.length();
        int c=0;
        for(int i=1;i<=4;i++){
            if(l<=0)return c;
            if(l>8)c+=8*i;
            else c+=l*i;
            l-=8;
        }return c;
    }
}