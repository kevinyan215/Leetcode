package leetcode.algorithms;

/**
 * Created by kevinyan on 10/18/17.
 */

/*
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */
public class RemoveElement{
	 public int removeElement(int[] nums, int val) {
        int replaceIndex = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[replaceIndex] = nums[i];
                replaceIndex++;
            }
        }
        
        return replaceIndex;
    }
}