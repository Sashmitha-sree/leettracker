class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
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
        
        int[] result=new int[numCourses];
        int i=0;
        while(!queue.isEmpty()){
            int node=queue.poll();
            result[i++]=node;
            for(int n:graph.get(node)){
                indegree[n]--;

                if(indegree[n]==0){
                    queue.offer(n);
                }
                
            }
            ind++;
        }

        if(ind==numCourses){
            return result;
        }
        else{
            return new int[] {};
        }
    }
}