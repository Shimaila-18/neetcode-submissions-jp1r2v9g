class Solution {
    public int islandPerimeter(int[][] grid) {
        int p =0;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    p+= (4-getAdjacent(grid,i,j));
                }
            }
        }
        return p;
    }
    private static int getAdjacent(int[][]grid,int r,int c){
        int dirrow[] = {-1,0,1,0};
        int dircol[] = {0,1,0,-1};
        int n=grid.length;
        int m=grid[0].length;
        int land=0;
        for(int i=0;i<4;i++){
            int nrow = r + dirrow[i];
            int ncol = c + dircol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1){
                land++;
            }
        }
        return land;
    }
}