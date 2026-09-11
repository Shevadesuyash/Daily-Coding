import java.util.HashSet;
import java.util.Set;

class Solution {
    

    public int totalNumbers(int[] digits) {
        int count=0;
        int n[]=new int[]{0,0,0,0,0,0,0,0,0,0,0};
        int c[]=new int[]{0,0,0,0,0,0,0,0,0,0,0};
        for(int i:digits)c[i]++;

        for(int i=100;i<1000;i=i+2){
            int h=i/100;
            int t=(i/10) %10;
            int d=i%10;
            n[h]++;
            n[t]++;
            n[d]++;
            if(n[h]<=c[h] && n[t]<=c[t] && n[d]<=c[d])count++;
            n[h]--;
            n[t]--;
            n[d]--;
        }return count;
    }
}
