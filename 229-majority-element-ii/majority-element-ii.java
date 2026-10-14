class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> result=new ArrayList<>();
        for(int val: map.keySet()){
            if(map.get(val)>(n/3)){
                result.add(val);
            }
        }

        return result;
    }
}