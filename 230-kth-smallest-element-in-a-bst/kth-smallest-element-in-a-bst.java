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
    public int kthSmallest(TreeNode root, int k) {
        return getAns(root).get(k-1);
    }
    public static ArrayList<Integer> getAns(TreeNode root){
        if(root==null)return new ArrayList<>();
        ArrayList<Integer> l=new ArrayList<>();
        l.addAll(getAns(root.left));
        l.add(root.val);
        l.addAll(getAns(root.right));
        return l;
    }
}