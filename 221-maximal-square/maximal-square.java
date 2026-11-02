class Solution {
    public int maximalSquare(char[][] matrix) {
        int n=matrix[0].length;
        int[] dp=new int[n+1];

        
        int best=0;

        for(char[] row:matrix){
            int prev=0;
            for(int j=1;j<=n;j++){
                int temp=dp[j];
                if(row[j-1]=='1'){
                    dp[j]=Math.min(dp[j],Math.min(dp[j-1],prev))+1;
                    best=Math.max(best,dp[j]);
                }
                else{
                    dp[j]=0;
                }

                prev=temp;
            }

        }

        return best*best;
    }
}