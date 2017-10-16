package leetcode;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by kevinyan on 8/27/17.
 */
public class Tester {
    public static void main(String args[]){
//        MinDiffBST min = new MinDiffBST();
//        TreeNode node = new TreeNode(1);
////        node.left = new TreeNode(null)
////        min.getMinimumDifference();
//        int[][] myArray = {{1,2}, {3,4}};

        System.out.println("hello");

        int[] arr = new int[]{3,2,4,9,12};
        System.out.println(Tester.findSum(arr, 222));
    }

    public static boolean findSum(int[] nums, int sum){
        int[] complements = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            for(int j=0; j<complements.length; j++){
                if(nums[i] == complements[j]){
//                    System.out.println("true");
                    return true;
                }
            }
            complements[i] = sum - nums[i];
        }

//        System.out.println("false");
        return false;
    }
}
