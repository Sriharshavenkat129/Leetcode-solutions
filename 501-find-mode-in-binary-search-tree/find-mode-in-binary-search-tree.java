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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        dfs(root,map);
        ArrayList<Integer> values=new ArrayList<>();
        int max=0;
        for(int value:map.values())max=Math.max(max,value);
        for(int key:map.keySet()){
            if(map.get(key)==max)values.add(key);
        }
        int[] arr=new int[values.size()];
        int index=0;
        for(int i:values){
            arr[index]=i;
            index++;
        }
        return arr;
    }
    public static void dfs(TreeNode root,HashMap<Integer,Integer>map){
        if(root==null)return;
        dfs(root.left,map);
        dfs(root.right,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
    }
}