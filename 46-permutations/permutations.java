class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];

        per(nums, results, curr, visited);
        return results;
    }

    public void per(int[] nums, List<List<Integer>> results, List<Integer> curr, boolean[] visited){
        if(curr.size()==nums.length){
            results.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(visited[i]){
                continue;
            }

            curr.add(nums[i]);
            visited[i]=true;

            per(nums, results, curr, visited);

            curr.remove(curr.size()-1);
            visited[i]=false;
        }
    }
}