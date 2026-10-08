class Solution {
    public String removeOuterParentheses(String s) {
        StringBuffer sb =new StringBuffer(s);

        int b=0;
        int i=0;

        while(sb.length()>i){
            if(b==0 && sb.charAt(i)=='('){sb.deleteCharAt(i);b++;}
            else if(sb.charAt(i)=='('){i++;b++;}
            else if(b==1 && sb.charAt(i)==')'){sb.deleteCharAt(i);b--;}
            else if(sb.charAt(i)==')'){i++;b--;}
            else i++;
        }return sb.toString();
    }
}