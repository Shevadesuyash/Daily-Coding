class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int i=0,j=0,m=grid.length,n=grid[0].length,x=0,y=0;
        while(true){
            if(i<0 || j<0 || i>=m || j>=n || grid[i][j]=='X')return new int[]{x,y};
            x=i;
            y=j;
            char mov=grid[i][j];
            if(mov=='L'){
                j--;
                grid[x][y]='X';
            }else if(mov=='R'){
                j++;
                grid[x][y]='X';
            }else if(mov=='U'){
                i--;
                grid[x][y]='X';
            }else{
                i++;
                grid[x][y]='X';
            }
        }
    }
}