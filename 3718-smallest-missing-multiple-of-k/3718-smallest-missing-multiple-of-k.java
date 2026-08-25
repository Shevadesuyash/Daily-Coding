class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)set.add(i);
        for(int i=1;i<=101;i++){
            if(set.contains(k*i))continue;
            return k*i;
        }return k;
    }
}