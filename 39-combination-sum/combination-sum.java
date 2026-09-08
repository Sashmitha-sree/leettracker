class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results=new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        
        sums(candidates, target, results, curr, 0,0);

        return results;
    }

    public void sums(int[] candidates, int target, List<List<Integer>> results, List<Integer> curr, int sum, int index){
        if(sum==target){
            results.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index; i<candidates.length;i++){
            if(sum+candidates[i]>target){
                continue;
            }
            
            curr.add(candidates[i]);
            sums(candidates, target, results, curr, sum+candidates[i], i);
            curr.remove(curr.size()-1);

        }
    }
}