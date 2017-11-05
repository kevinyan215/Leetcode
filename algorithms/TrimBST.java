package leetcode.algorithms;

/**
 * Created by kevinyan on 11/4/17.
 */

/*
Given a binary search tree and the lowest and highest boundaries as L and R, trim the tree so that all its elements lies in [L, R] (R >= L). You might need to change the root of the tree, so the result should return the new root of the trimmed binary search tree.

Example 1:
Input: 
    1
   / \
  0   2

  L = 1
  R = 2

Output: 
    1
      \
       2
Example 2:
Input: 
    3
   / \
  0   4
   \
    2
   /
  1

  L = 1
  R = 3

Output: 
      3
     / 
   2   
  /
 1

 */

 public class TrimBST{
 	 public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root==null) return null;
        
        TreeNode left = trimBST(root.left, L, R);
        TreeNode right = trimBST(root.right, L, R);
        
        TreeNode node = null;
        if(root.val>=L && root.val<=R){
            node = new TreeNode(root.val);
            node.left = left;
            node.right = right;
        }else if(left!=null){
            node = left;
        }else if(right!=null){
            node = right;
        }
        
        return node;
    }
 }