class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=nums.size();
        int sum=n;
        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            set.add(nums.get(i));
            int x=0;
            for(int j=i+1;j<n;j++){
                set.add(nums.get(j));
                 x=set.size();
                sum+=x*x;
            }
           
        }return sum;
    }
}