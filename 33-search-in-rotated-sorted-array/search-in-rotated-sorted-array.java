class Solution {
    public int search(int[] nums, int target) {
        int index=0;
        for(int num:nums){
            if(num==target){
                return index;
            }
            index++;
        }
        return -1;
    }
}