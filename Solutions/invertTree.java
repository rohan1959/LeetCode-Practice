Problem : 

Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9

to

     4
   /   \
  7     2
 / \   / \
9   6 3   1

Solution :

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        
        TreeNode Temp;
        
        if(root==null)
          return null;
        
        if(root.right==null &&root.left==null)
          return root;
        
        else {
            Temp = root.left;
            root.left=invertTree(root.right);
            root.right=invertTree(Temp);
        }
    return root;
    }
}