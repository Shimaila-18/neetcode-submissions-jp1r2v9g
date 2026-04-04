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
    int count = 0;
    private void goodNodesCount(TreeNode root,int maxVal) {
        if(root==null){
            return;
        }
        if(root.val>=maxVal){
            count++;
        }
        goodNodesCount(root.left,Math.max(maxVal,root.val));
        goodNodesCount(root.right,Math.max(maxVal,root.val));

    }
    public int goodNodes(TreeNode root) {
        goodNodesCount(root,root.val);
        return count;
    }
}
