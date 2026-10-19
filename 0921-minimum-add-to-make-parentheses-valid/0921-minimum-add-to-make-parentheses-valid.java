class Solution {
    public int minAddToMakeValid(String s) {
        int l=s.length();int i=0;
        StringBuffer sb= new StringBuffer(s);
        while(i<l-1){
            if(sb.charAt(i)=='(' && sb.charAt(i+1)==')'){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                i--;
                if(i<0)i=0;
            }else i++;
            l=sb.length();
        }return sb.length();
    }
}