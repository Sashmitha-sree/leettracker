class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] indegree=new int[n+1];
        int[] outdegree=new int[n+1];
        for(int[] m:trust){
            int a=m[0];
            int b=m[1];

            indegree[b]++;
            outdegree[a]++;
        }

        for(int i=1;i<=n;i++){
            if((outdegree[i]==0) && (indegree[i]==n-1)){
                return i;
            }
        }
        return -1;
    }
}