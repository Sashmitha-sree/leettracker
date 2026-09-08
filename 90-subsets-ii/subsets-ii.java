class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> results= new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(nums);
        subs(nums, results, curr, 0);

        return results;
    }

    public void subs(int[] nums, List<List<Integer>> results,List<Integer> curr, int index){
        
        results.add(new ArrayList<>(curr));
            

        for(int i=index;i<nums.length;i++){

            if(i>index && nums[i]==nums[i-1] ){
                continue;
            }

            curr.add(nums[i]);
            subs(nums, results,curr, i+1 );

            curr.remove(curr.size()-1);

        }

    }
}