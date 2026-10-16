class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(x,y)->Integer.compare(x[1],y[1]));

        
        int count=1;
        int prev_arrow=points[0][1];

        for(int i=0;i<points.length-1;i++){
            if(prev_arrow<points[i+1][0]){
                prev_arrow=points[i+1][1];
                count++;
            }
        }

        return count;

    }
}