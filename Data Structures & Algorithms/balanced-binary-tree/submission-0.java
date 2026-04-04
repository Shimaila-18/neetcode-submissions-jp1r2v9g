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
    public Pair<Boolean,Integer> isBalancedHelper(TreeNode root) {
        if(root==null){
            return new Pair<>(true,0);
        }

        Pair<Boolean,Integer> pLeft = isBalancedHelper(root.left);
        Pair<Boolean,Integer> pRight = isBalancedHelper(root.right);
        int height = Integer.max(pLeft.getValue(),pRight.getValue())+1;

        boolean isBalance = pLeft.getKey() && pRight.getKey() && (Math.abs(pLeft.getValue()-pRight.getValue())<=1);
        
        return  new Pair<>(isBalance,height);
    }
    public boolean isBalanced(TreeNode root) {
        return (isBalancedHelper(root).getKey());
    }
}
