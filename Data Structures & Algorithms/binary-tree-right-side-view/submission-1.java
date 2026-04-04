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
    List<Integer> res = new ArrayList<Integer>(); 
    public void rightSideViewDfs(TreeNode root,int depth) {
        if(root==null){
            return;
        }
        if(depth==res.size()){
            res.add(root.val);
        }
        rightSideViewDfs(root.right,depth+1);
        rightSideViewDfs(root.left,depth+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        rightSideViewDfs(root,0);
        return res;
    }
}
