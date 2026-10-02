
class Solution {
    public List<String> generateParenthesis(int n) {
        n*=2;
        Deque<String> q = new ArrayDeque<>();
        String p="()";
        HashSet<String> a =new HashSet<>();
        q.offer(p);

        while(!q.isEmpty()){
            String x =q.pop();
            int l=x.length();
            if(l==n){
                a.add(x);
                continue;
            }else if(l>n)break;
            for(int i=0;i<l;i++){
                q.offer(new StringBuffer(x).insert(i,p).toString());
            }
        }return List.copyOf(a);
    }
}