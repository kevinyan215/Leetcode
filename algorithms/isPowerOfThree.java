package leetcode.algorithms;

/**
 * Created by kevinyan on 10/17/17.
 */

/*
Given an integer, write a function to determine if it is a power of three.
 */
public class IsPowerOfThree{
	 public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        if(n == 1) return true;
        
        int mod = 0;
        while(n>=3 && n%3 ==0){
            n = n/3;
        }
        if(n==1) return true;
        return false;
    }
}