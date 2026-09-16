class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree=new int[numCourses];
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int[] n:prerequisites){
            int course=n[0];
            int pre=n[1];
            graph.get(pre).add(course);
            indegree[course]++;
        }

        Queue<Integer> queue=new LinkedList<>();
        int ind=0;

        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        

        while(!queue.isEmpty()){
            int node=queue.poll();

            for(int n:graph.get(node)){
                indegree[n]--;

                if(indegree[n]==0){
                    queue.offer(n);
                }
                
            }
            ind++;
        }

        return ind==numCourses;
    }
}