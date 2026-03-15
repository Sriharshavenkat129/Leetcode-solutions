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
    public boolean hasPathSum(TreeNode root, int targetSum) {
       return getans(root,targetSum,0);
    }
    public static boolean getans(TreeNode root,int targetSum,int c_sum){
        if(root==null){
            return false;
        }
        if(root.right==null && root.left==null){
            //System.out.println(c_sum);
            if(c_sum+root.val==targetSum) return true;
            else return false;
        }
        return getans(root.right,targetSum,c_sum+root.val) || getans(root.left,targetSum,c_sum+root.val);
    }
}