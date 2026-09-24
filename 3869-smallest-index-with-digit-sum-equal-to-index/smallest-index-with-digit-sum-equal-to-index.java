class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sum_digit(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
    public int sum_digit(int num){
        int res=0;
        int rem=0;
        while(num>0){
            rem=num%10;
            res+=rem;
            num/=10;
        }
        return res;
    }
}