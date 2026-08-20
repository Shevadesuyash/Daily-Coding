class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int a1[]=new int [n];
        int a2[]=new int [n];

        a1[0]=nums[0];
        a2[0]=nums[1];
        int a=0,b=0,x=2;
        while(x<n){
            if(a1[a]>a2[b]){
                a1[++a]=nums[x++];
            }else a2[++b]=nums[x++];
        }
        for(int i=0;i<=a;i++)nums[i]=a1[i];
        for(int i=0;i<=b;i++)nums[i+a+1]=a2[i];
        return nums;
    }
}