class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        Arrays.sort(candidates);
        sums(candidates, target, results, curr, 0, 0);

        return results;
    }

    public void sums(int[] candidates, int target, List<List<Integer>> results, List<Integer> curr, int sum, int index){

        if(sum==target){
            results.add(new ArrayList<>(curr));
            return;
        }

        for(int i=index;i<candidates.length;i++){
            if(sum+candidates[i] > target){
                continue;
            }

            if(i>index && candidates[i]==candidates[i-1]){
                continue;
            }
            curr.add(candidates[i]);
            sums(candidates, target, results, curr, sum+candidates[i], i+1);

            curr.remove(curr.size()-1);
        }
    }
}