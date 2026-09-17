/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode, TreeNode> parent=new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        buildParent(root,null);

        Queue<TreeNode> queue=new LinkedList<>();
        Set<TreeNode> visited=new HashSet<>();

        queue.offer(target);
        visited.add(target);

        int dist=0;

        while(!queue.isEmpty()){
            int size=queue.size();

            if(dist==k) break;
            for(int i=0;i<size;i++){
                TreeNode temp=queue.poll();

                if(temp.left!=null && !visited.contains(temp.left)){
                    queue.offer(temp.left);
                    visited.add(temp.left);
                }
                if(temp.right!=null && !visited.contains(temp.right)){
                    queue.offer(temp.right);
                    visited.add(temp.right);
                }
                TreeNode par=parent.get(temp);
                if(par!=null && !visited.contains(par)){
                    queue.offer(par);
                    visited.add(par);
                }
            }
            dist++;
        }

        List<Integer> result=new ArrayList<>();

        for(TreeNode n:queue){
            result.add(n.val);
        }

        return result;
    }
    public void buildParent(TreeNode node,TreeNode par){
        if(node==null){
            return;
        }
        parent.put(node,par);
        buildParent(node.left,node);
        buildParent(node.right,node);
    }
}