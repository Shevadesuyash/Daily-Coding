class Solution {
    public boolean isValid(String s) {
        LinkedList<Character> st=new LinkedList<>();
        for(char c:s.toCharArray()){
            if(c=='(' || c=='{'||c=='[')st.addFirst(c);
            else{
                if(st.size()==0)return false;
                char x=st.removeFirst();
                if(x=='(' && ')'==c) continue;
                else if(x=='{' && '}'==c) continue;
                else if(x=='[' && ']'==c) continue;
                else return false;

            }
        }return st.size()==0;
    }
}