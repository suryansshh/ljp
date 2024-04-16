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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
         TreeNode node = new TreeNode(val);
            if(depth==1){
           
            node.left = root;
            return node;
            }
         return helper(root , val , depth-1);
             }
    TreeNode helper(TreeNode root , int  val , int k){
        if(root==null) return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0 ;i<n;i++){
                TreeNode curr = q.poll();
                k--;
                // place where the left subtree and right subtree will be the value;
                if(k==0){
                    TreeNode leftSub = curr.left;
    TreeNode rightSub = curr.right;
    curr.left = new TreeNode(val);
    curr.right = new TreeNode(val);
    curr.left.left = leftSub;
    curr.right.right = rightSub;
            
                }else{
                    if(curr.left!=null){
                        q.offer(curr.left);
                    }
                    if(curr.right!=null){
                        q.offer(curr.right);
                    }
                }
            }
        }
        return root;
    }
}