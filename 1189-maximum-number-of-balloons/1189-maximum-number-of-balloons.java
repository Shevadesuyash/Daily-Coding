class Solution {
    public int maxNumberOfBalloons(String text) {
        int ar[]=new int [26];
        for(char c: text.toCharArray()){
            int x = c- 'a';
            ar[x]++;
        }
        int b =ar[1];
        return Math.min(b,Math.min(ar[0],Math.min(ar['n'-'a'],Math.min((int)(ar['l'-'a']/2),(int)(ar['o'-'a']/2)))));
    }
}