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
    public int averageOfSubtree(TreeNode root) {
        int[] ans=new int[1];
        getAns(root,ans);
        return ans[0];
    }
    public void getAns(TreeNode root,int[]ans){
        if(root==null)return;
        int [] n=new int[1];
        int sum=calculateSum(n,root);
        if((sum/n[0])==root.val)ans[0]++;
        getAns(root.left,ans);
        getAns(root.right,ans);
    }
    public int calculateSum(int[] n,TreeNode node){
        if(node==null)return 0;
        n[0]++;
        return node.val+calculateSum(n,node.left)+calculateSum(n,node.right);
    }
}