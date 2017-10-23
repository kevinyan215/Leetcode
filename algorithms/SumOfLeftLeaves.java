package leetcode.algorithms;

/**
 * Created by kevinyan on 10/22/17.
 */

/*
Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.
 */

public class SumOfLeftLeaves{
    private int sum = 0;
    
    public int sumOfLeftLeaves(TreeNode root) {
        helper(root, false);
        return sum;
    }
    
    public boolean helper(TreeNode root, boolean isLeft){
        if(root == null) return true;
        helper(root.left, true);
        helper(root.right, false);
        
        if(root.left==null && root.right==null && isLeft) sum += root.val;
        return false;
    }
}