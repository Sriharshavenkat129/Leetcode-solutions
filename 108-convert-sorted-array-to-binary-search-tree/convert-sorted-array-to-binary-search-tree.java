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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root=null;
        if(nums.length==0)return null;
        int mid=(nums.length-1)/2;
        root=new TreeNode(nums[mid]);
        generate(root,0,mid-1,nums);
        generate(root,mid+1,nums.length-1,nums);
        return root;
    }
    public static TreeNode appendChild(TreeNode root,int num){
        TreeNode node=new TreeNode(num);
        if(root==null)return node;
        else if(root.val<num){
            root.right=appendChild(root.right,num);
        }
        else{
            root.left=appendChild(root.left,num);
        }
        return root;
    }
    public static void generate(TreeNode root,int st,int end,int[] nums){
        if(st>end)return;
        int mid=(st+end)/2;
        appendChild(root,nums[mid]);
        generate(root,st,mid-1,nums);
        generate(root,mid+1,end,nums);
    }
}