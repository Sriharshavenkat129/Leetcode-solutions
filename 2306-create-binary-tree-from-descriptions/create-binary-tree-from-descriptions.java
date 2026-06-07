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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashSet<Integer> set=new HashSet<>();
        for(int[] arr:descriptions){
            set.add(arr[0]);
        }
        for(int[] arr:descriptions){
            if(set.contains(arr[1]))set.remove(arr[1]);
        }
        int orgroot=0;
        for(int val:set) orgroot=val;
        System.out.println(orgroot);
        HashMap<Integer,TreeNode> map=new HashMap<>();
        for(int[] arr:descriptions){
            TreeNode root=map.getOrDefault(arr[0],new TreeNode(arr[0]));
            TreeNode child=map.getOrDefault(arr[1],new TreeNode(arr[1]));
            if(arr[2]==1)root.left=child;
            else root.right=child;
            map.put(arr[0],root);
            map.put(arr[1],child);
        }
        return map.get(orgroot);
    }
}