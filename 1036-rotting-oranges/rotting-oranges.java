class Solution {
    public class node{
        int timeframe;
        int x;
        int y;
        node(int timeframe, int x, int y){
            this.timeframe=timeframe;
            this.x=x;
            this.y=y;
        }
    }
    public int orangesRotting(int[][] grid) {
        Queue<node> queue=new LinkedList<>();
        int time=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.offer(new node(time,i,j));
                }
            }
        }

        while(!queue.isEmpty()){
            node a=queue.poll();
            time=Math.max(time,a.timeframe);
            int r=a.x;
            int s=a.y;
            if(r >= 0 && r < grid.length && s >= 0 && s+1 < grid[0].length){
                if((grid[r][s+1] ==1)){
                    grid[r][s+1]=2;
                    queue.offer(new node(a.timeframe+1,r,s+1));
                }
            }
            if(r >= 0 && r+1 < grid.length && s >= 0 && s < grid[0].length){
                if(grid[r+1][s]==1){
                    grid[r+1][s]=2;
                    queue.offer(new node(a.timeframe+1,r+1,s));
                }
            }
            if(r >= 0 && r < grid.length && s-1 >= 0 && s < grid[0].length){
                if((grid[r][s-1] ==1)){
                    grid[r][s-1]=2;
                    queue.offer(new node(a.timeframe+1,r,s-1));
                }
            }
            if(r-1 >= 0 && r < grid.length && s >= 0 && s < grid[0].length){
                if(grid[r-1][s]==1){
                    grid[r-1][s]=2;
                    queue.offer(new node(a.timeframe+1,r-1,s));
                }
            }
        }
        for (int[] row : grid) {
            for (int val : row) {
                if (val == 1) return -1;
            }
        }

        return time;
    }
}