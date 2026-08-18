class Solution {
    public int largestInteger(int[] nums, int k) {
        if(nums.length==k){
            int mx=-1;
            for(int i:nums)mx=Math.max(mx,i);
            return mx;
        }
        int ar[]=new int[51];
        for(int i:nums)ar[i]++;
        if(k==1){
            int mx=-1;
            for(int i:nums)if(ar[i]==1)mx=Math.max(mx,i);
            return mx;
        }
        int ans=-1;
        if(ar[nums[0]]==1)ans=nums[0];
        if(ar[nums[nums.length-1]]==1)ans=Math.max(ans,nums[nums.length-1]);
        return ans;
    }
}