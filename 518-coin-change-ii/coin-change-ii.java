class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return cc(coins, amount, coins.length, dp);
   
    }
    public int cc(int[] coins, int amount, int n,int[][] dp){
        if(amount==0) return 1;
        if(amount<0 || n==0) return 0;

        if(dp[n-1][amount]!=-1){
            return dp[n-1][amount];
        }

        dp[n-1][amount]=cc(coins,amount-coins[n-1],n,dp)+cc(coins,amount, n-1,dp);

        return dp[n-1][amount];
    }

}