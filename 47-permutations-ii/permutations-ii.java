class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        per(nums, results, curr, visited);

        return results;
    }

    public void per(int[] nums,
                    List<List<Integer>> results,
                    List<Integer> curr,
                    boolean[] visited) {

        if (curr.size() == nums.length) {
            results.add(new ArrayList<>(curr));
            return;
        }

        Set<Integer> used=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            if (visited[i]) {
                continue;
            }

            if(used.contains(nums[i])){
                continue;
            }

            used.add(nums[i]);

            curr.add(nums[i]);
            visited[i] = true;

            per(nums, results, curr, visited);

            curr.remove(curr.size() - 1);
            visited[i] = false;
        }
    }
}