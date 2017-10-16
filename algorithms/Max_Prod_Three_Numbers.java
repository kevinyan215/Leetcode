package leetcode.algorithms;

import java.util.ArrayList;

/**
 * Created by kevinyan on 10/15/17.
 */

/*
    Given an integer array, find three numbers whose product is maximum and output the maximum product.
 */
public class Max_Prod_Three_Numbers {
    public int maximumProduct(int[] nums) {
        int max1 = -9999;
        int max2 = max1;
        int max3 = max1;

        int smallest1 = 9999;
        int smallest2 = smallest1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }else if(nums[i] > max2){
                max3 = max2;
                max2 = nums[i];
            }else if(nums[i] > max3){
                max3 = nums[i];
            }

            if(nums[i] < smallest1){
                smallest2 = smallest1;
                smallest1 = nums[i];
            }else if(nums[i] < smallest2){
                smallest2 = nums[i];
            }
        }

        int num1 = max1*max2*max3;
        int num2 = max1*smallest1*smallest2;
        return num1 > num2? num1: num2;
    }
}
