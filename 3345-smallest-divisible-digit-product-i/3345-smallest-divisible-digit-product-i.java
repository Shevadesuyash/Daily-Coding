class Solution {
    public int smallestNumber(int n, int t) {
        while(n<=100){
            if(is(n,t))break;
            n++;
        }return n;
    }
    public boolean is(int n, int t){
        int p=1;
        boolean db10=true;
        while(n>0){
            int r=n%10;
            if (db10 && r==0)return true;
            p*=r;
            n=n/10;
            db10=false;
        }return p%t==0;
    }
}