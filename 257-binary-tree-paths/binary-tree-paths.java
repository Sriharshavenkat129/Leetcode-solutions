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
    public List<String> binaryTreePaths(TreeNode root) {
        // List<String> l=new ArrayList<>();
        // if(root==null)return;
        // if(root.left==null && root.right==null){
        //     str+=root.val;
        //     l.add(str);
        //     return l;
        // }
        // l.addAll(getAns(root.left,str+root.val+"->"));
        // l.addAll(getAns(root.right,str+root.val+"->"));
        // return l;
        return getAns(root,"");
    }
    public static List<String> getAns(TreeNode root,String str){
        List<String> l=new ArrayList<>();
        if(root==null)return l;
        if(root.left==null && root.right==null){
            str+=root.val;
            l.add(str);
            return l;
        }
        l.addAll(getAns(root.left,str+root.val+"->"));
        l.addAll(getAns(root.right,str+root.val+"->"));
        return l;
    }
}