class Solution {
    public boolean stoneGame(int[] piles) {
        //return win(piles,0,piles.length-1,0,true);
        return true;
    }

    public boolean win(int ar[],int i, int j, int s,boolean a){
        if(i>j)return s>0 ? true : false;

        if(a) return (win(ar,i+1,j,s+ar[i],false) || win(ar,i,j-1,s+ar[j],false));
        else return (win(ar,i+1,j,s-ar[i],true) || win(ar,i,j-1,s-ar[j],true));
    }
}