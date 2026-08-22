class Solution {
    public boolean checkDivisibility(int n) {
        if(n<10)return false;

        long s=0,p=1;
        int x=n;
        while(n>0){
            int r=n%10;
            s+=r;
            p*=r;
            n/=10;
        }return x%(s+p)==0;
    }
}