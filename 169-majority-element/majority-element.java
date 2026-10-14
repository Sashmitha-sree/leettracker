class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=nums[0];
        for(int val:nums){
            if(map.get(max)<map.get(val)){
                max=val;
            }
        }
        return max;
    }
}