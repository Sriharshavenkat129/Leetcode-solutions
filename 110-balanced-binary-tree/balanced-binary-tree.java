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
    public boolean isBalanced(TreeNode root) {
        if(root==null || root.right==null && root.left==null)
        return true;

        return check(root);
        
    }
    public boolean check(TreeNode root){
        if(root==null)return true;
        int lc=helper(root.left);
        int rc=helper(root.right);
        return Math.abs(lc-rc)<=1 && check(root.left) && check(root.right);
    }
    public int helper(TreeNode root){
       if(root==null)
            return 0;
        return Math.max(1+helper(root.left),1+helper(root.right));
    }
}