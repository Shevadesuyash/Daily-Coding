class Solution {
    public int countCommas(int n) {
        if(n<1000)return 0;
        if(n<1_000_000) return n-999;
        return -1;
    }
}