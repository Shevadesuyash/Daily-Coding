class Solution {
    public int maxDepth(String s) {
        int m=0,x=0;
        for(char c : s.toCharArray()){
            if(c=='('){
                x++;
                if(m<x)m=x;
            }
            else if(c==')')x--;
        }return m;
    }
}