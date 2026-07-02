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
    public int sumNumbers(TreeNode root) {
        int[] ans=new int[1];
        add(ans,root,0);
        return ans[0];
    }
    public static void add(int[] result,TreeNode root,int current_sum){
        if(root==null)return;
        if(root.left==null && root.right==null)result[0]=result[0]+(current_sum*10)+root.val;
        current_sum=current_sum*10+root.val;
        add(result,root.left,current_sum);
        add(result,root.right,current_sum);
    }
}