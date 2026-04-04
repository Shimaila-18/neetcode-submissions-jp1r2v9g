/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return new ArrayList<Integer>();
        }
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q. offer(root);

        while(!q.isEmpty()){
            TreeNode rightNode = null;
            int qlen = q.size();

            for(int i=0;i<qlen;i++){
                TreeNode node = q.poll();
                rightNode = node;
                if(node.left!=null)
                    q.offer(node.left);
                if(node.right!=null)
                    q.offer(node.right);
            }

            if(rightNode!=null){
                res.add(rightNode.val);
            }
        }
        return res;
    }
}
