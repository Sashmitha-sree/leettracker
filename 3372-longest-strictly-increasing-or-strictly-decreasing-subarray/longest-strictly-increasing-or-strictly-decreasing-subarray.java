class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc=1;
        int dec=1;
        int n=nums.length;
        int maxLen = 1;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                inc++;
                dec=1;
            }
            else if(nums[i]==nums[i+1]){
                inc=1;
                dec=1;
            }
            else{
                dec++;
                inc=1;
            }
            maxLen = Math.max(maxLen, Math.max(inc, dec));
        }

        return maxLen;
    }
}