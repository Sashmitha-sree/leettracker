class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        int max_length=0;
        

        for(int num:set){
            if(!set.contains(num-1)){
                int j=num+1;
                int max=1;
                while(set.contains(j)){
                    max++;
                    j++;
                }
                max_length=Math.max(max,max_length);
            }
        }

        return max_length;
    }
}