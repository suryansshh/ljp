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
        Set<Integer> children = new HashSet<>();
        HashMap<Integer , TreeNode> map = new HashMap<>();
        for(int ar[] :descriptions){
            int parent = ar[0] , child = ar[1] , isleft = ar[2];
            children.add(child);
            TreeNode curr = map.getOrDefault(parent , new TreeNode(parent));
            if(isleft == 1){
                curr.left = map.getOrDefault(child , new TreeNode(child));
                map.put(child , curr.left);
            }else{
                curr.right  = map.getOrDefault(child , new TreeNode(child));
                map.put(child , curr.right);
            }
            map.put(parent , curr);
        }
        int key = -1;
        for(int arr[]:descriptions){
            int parent = arr[0];
            if(!children.contains(parent)){
                key = parent;
                break;
            }
        }
        return map.get(key);
    }
}