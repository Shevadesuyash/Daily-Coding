class Solution {
    public int minSwaps(int[] nums) {
        int l=nums.length;
        int ar[][]=new int[l][2];
        for(int i=0;i<l;i++){
            ar[i][0]=nums[i];
            ar[i][1]=sumx(nums[i]);
        }
        Arrays.sort(ar,(a,b)-> a[1]==b[1]?Integer.compare(a[0],b[0]): Integer.compare(a[1],b[1]));
        Map<Integer,Integer> map =new HashMap();
        for(int i=0;i<l;i++){
            map.put(ar[i][0],i);
        }
        boolean [] visit =new boolean[l];
        int c=0;

        for(int i=0;i<l;i++){
            if(visit[i]||map.get(nums[i])==i)continue;
            int x=0;
            int j =i;
            while(!visit[j]){
                visit[j]=true;
                j=map.get(nums[j]);
                x++;
            }
            c+=x-1;
            
            
        }return c;
    }

    public int sumx(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }return s;
    }
}