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
    public TreeNode balanceBST(TreeNode root) {
       ArrayList<Integer> arr=new ArrayList<>();
       inorder(arr,root);
      // System.out.println(arr.toString());
       TreeNode newroot=construct(arr,0,arr.size()-1);
       return newroot;
    }
public void inorder(ArrayList<Integer> arr,TreeNode root){
    if(root==null)
    return;
    inorder(arr,root.left);
    arr.add(root.val);
    inorder(arr,root.right);
}
public TreeNode constructBST(ArrayList<Integer> arr){
    if(arr.size()==0)return null;
    int mid=arr.size()/2;
    TreeNode root=new TreeNode(arr.get(mid));
  //  System.out.println(root.val);
    ArrayList<Integer> leftarr=new ArrayList<>();
    ArrayList<Integer> rightarr=new ArrayList<>();
    for(int i=0;i<arr.size();i++){
        if(i<mid) leftarr.add(arr.get(i));
        if(i>mid) rightarr.add(arr.get(i));
    }
    root.left=constructBST(leftarr);
    root.right=constructBST(rightarr);
    return root;
}
public TreeNode construct(ArrayList<Integer> arr,int start,int end){
    if(start>end) return null;
    int mid=(start+end)/2;
    TreeNode root=new TreeNode(arr.get(mid));
    root.left=construct(arr,start,mid-1);
    root.right=construct(arr,mid+1,end);
    return root;
}
}