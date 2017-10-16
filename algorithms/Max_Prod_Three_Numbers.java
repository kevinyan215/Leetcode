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

        ArrayList<Integer> copy = new ArrayList<>();
        ArrayList<Integer> copy2 = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            copy.add(nums[i]);
            copy2.add(nums[i]);
        }

        int product = 1;
        int biggestIndex = 0;
        int counter = 0;
        while(counter < 3){
            biggestIndex = 0;
            for(int i=0; i<copy.size(); i++){
                if(copy.get(i) >= copy.get(biggestIndex)){
                    biggestIndex = i;
                }
            }
            product *= copy.get(biggestIndex);
            copy.remove(biggestIndex);
            counter++;
        }

        counter = 0;
        int smallestIndex = 0;
        int product2 = 1;
        while(counter < 3){
            if(counter == 0){
                biggestIndex = 0;
                for(int i=0; i<copy2.size(); i++){
                    if(copy2.get(i) > copy2.get(biggestIndex)){
                        biggestIndex = i;
                    }
                }
                product2 *= copy2.get(biggestIndex);
                copy2.remove(biggestIndex);
            }else{
                smallestIndex = 0;
                for(int i=0; i<copy2.size(); i++){
                    if(copy2.get(i) < copy2.get(smallestIndex)){
                        smallestIndex = i;
                    }
                }
                product2 *= copy2.get(smallestIndex);
                copy2.remove(smallestIndex);
            }
            counter++;
        }

        return product > product2? product: product2;
    }
}
