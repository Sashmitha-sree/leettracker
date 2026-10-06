/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> traverse=new ArrayList<>();

        Queue<TreeNode> queue=new LinkedList<>();

        if(root==null){
            return traverse;
        }

        queue.offer(root);
        TreeNode temp=root;
        while(!queue.isEmpty()){
            List<Integer> curr=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                temp=queue.poll();
                curr.add(temp.val);
                if(temp.left != null){
                    queue.offer(temp.left);
                }
                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
            traverse.add(curr);
        }

        return traverse;
    }
}