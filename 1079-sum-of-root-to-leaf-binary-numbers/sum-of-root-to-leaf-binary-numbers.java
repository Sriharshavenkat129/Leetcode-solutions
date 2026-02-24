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
    public int sumRootToLeaf(TreeNode root) {
        if(root.left==null && root.right==null) return root.val;
        return helper("",root);
    }
    public int helper(String binary,TreeNode root){
        if(root==null){
            //return Integer.parseInt(binary,2);
            return 0;
        }
        if(root.left==null && root.right==null) return Integer.parseInt(binary+String.valueOf(root.val),2);

        return helper(binary+String.valueOf(root.val),root.left)+helper(binary+String.valueOf(root.val),root.right);
    }
}