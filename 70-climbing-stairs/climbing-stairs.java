class Solution {
    public int climbStairs(int n) {
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);

        return sc(n,dp);
    }
    public int sc(int n, int[] dp){
        if(n==0) return 1;

        if(n<0) return 0;

        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]=sc(n-1,dp)+sc(n-2,dp);

        return dp[n];
    }
}