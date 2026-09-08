class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results=new ArrayList<>();
        List<Integer> curr= new ArrayList<>();

        subs(nums, results, curr, 0);

        return results;
    }

    public void subs(int[] nums, List<List<Integer>> results, List<Integer> curr, int index){
        if(index==nums.length){
            results.add(new ArrayList(curr));
            return;
        }

        curr.add(nums[index]);
        subs(nums,results,curr, index+1);

        curr.remove(curr.size()-1);

        subs(nums, results, curr, index+1);


    }
}