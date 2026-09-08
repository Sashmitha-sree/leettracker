class Solution {
    public int missingNumber(int[] nums) {
        int max= nums.length+1;

        int tempSum=0;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            tempSum+=nums[i];
        }

        for(int j=0;j<max;j++){
            sum+=j;
        }

        return sum-tempSum;
    }
}