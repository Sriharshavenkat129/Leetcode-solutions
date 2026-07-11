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
    public int sumOfLeftLeaves(TreeNode root) {
        int[] ans=new int[1];
        dfs(root,ans,0);
        return ans[0];
    }
    public static void dfs(TreeNode root,int[] arr,int side){
        if(root==null)return;
        if(root.left==null && root.right==null && side==-1){
            arr[0]+=root.val;
            return;
        }
        dfs(root.left,arr,-1);
        dfs(root.right,arr,1);
    }

}