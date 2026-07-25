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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> l=getNodes(root);
        if(l.size()<=1)return 0;
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<l.size();i++){
            ans=Math.min(ans,l.get(i)-l.get(i-1));
        }
        return ans;
    }
    public static ArrayList<Integer> getNodes(TreeNode root){
        ArrayList<Integer> l=new ArrayList<>();
        if(root==null)return l;
        l.addAll(getNodes(root.left));
        l.add(root.val);
        l.addAll(getNodes(root.right));
        return l;
    }
}