package leetcode.algorithms;

/**
 * Created by kevinyan on 10/21/17.
 */

/*
Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7

   return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]
 */
public class BinaryTreeLevel_II{
 private List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        initiateList(getMaxLevel(root));
        traverse(root,0);
        return res;
    }
    
    public void traverse(TreeNode node, int level){
        if(node==null) return;   
        traverse(node.left, level+1);
        traverse(node.right, level+1);
        
        level = (res.size()-1)-level;
        res.get(level).add(node.val);        
    }
    
    public int getMaxLevel(TreeNode node){
        if(node==null) return 0;
        
        int left = getMaxLevel(node.left)+1;
        int right = getMaxLevel(node.right)+1;
        
        return left>right? left:right;
    }
    
    public void initiateList(int size){
        for(int i=0; i<size; i++){
            res.add(new ArrayList<Integer>());
        }
    }
}