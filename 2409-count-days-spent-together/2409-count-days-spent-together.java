class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        boolean days[]=new boolean[366];
        int aam=Integer.parseInt(arriveAlice.substring(0,2));
        int aad=Integer.parseInt(arriveAlice.substring(3,5));
        int lam=Integer.parseInt(leaveAlice.substring(0,2));
        int lad=Integer.parseInt(leaveAlice.substring(3,5));
        int abm=Integer.parseInt(arriveBob.substring(0,2));
        int abd=Integer.parseInt(arriveBob.substring(3,5));
        int lbm=Integer.parseInt(leaveBob.substring(0,2));
        int lbd=Integer.parseInt(leaveBob.substring(3,5));
        
        int monthsDay[]=new int []{0,0,31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};


        int c= 0;


        if(aam<=lam){
            int aaD=monthsDay[aam]+aad;
            int laD=monthsDay[lam]+lad;
            for(int i=aaD;i<=laD;i++)days[i]=true;

            int abD=monthsDay[abm]+abd;
            int lbD=Math.min(monthsDay[lbm]+lbd,laD);
            for(int i=abD;i<=lbD;i++)if(days[i])c++;
        }else{
            int aaD=monthsDay[aam]+aad;
            int laD=monthsDay[lam]+lad;
            for(int i=aaD;i<=365;i++)days[i]=true;
            for(int i=1;i<=laD;i++)days[i]=true;

            int abD=monthsDay[abm]+abd;
            int lbD=monthsDay[lbm]+lbd;
            if(abD>lbD)for(int i=abD;i<=365;i++)if(days[i])c++;
            for(int i=1;i<=lbD;i++)if(days[i])c++;
        }return c;
    }
}