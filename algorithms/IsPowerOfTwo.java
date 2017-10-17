package leetcode.algorithms;

/**
 * Created by kevinyan on 10/16/17.
 */
/*
Given an integer, write a function to determine if it is a power of two.
 */
public class IsPowerOfTwo{
	public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false; 
 
        // return (n^(n-1)) == ((n*2)-1);
        return (n&n-1) == 0;
    
    }
}