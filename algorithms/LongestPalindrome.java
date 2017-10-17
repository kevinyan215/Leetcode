package leetcode.algorithms;

import java.util.Hashtable;
import java.util.Set;

/**
 * Created by kevinyan on 10/15/17.
 */

/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

This is case sensitive, for example "Aa" is not considered a palindrome here.

Ex.
Input:
"abccccdd"

Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class LongestPalindrome {
    //more efficient
     public int longestPalindrome(String s) {
        boolean[] arr = new boolean[128];
        int res = 0;
        // char[] chars = {'c', 'c', 'b', 'c', 'c','b'};
        for(char c: s.toCharArray()){
            arr[c] = !arr[c];
            if(!arr[c]){
                res += 2;
            }
        }
        if(s.length() > res) res++;
        return res;
    }
    
    // public int longestPalindrome(String s) {
    //     Hashtable<Character,Integer> ht = new Hashtable<>();

    //     char[] arr = s.toCharArray();
    //     for(char letter: arr){
    //         if(ht.containsKey(letter)){
    //             ht.put(letter, ht.get(letter)+1);
    //         }else{
    //             ht.put(letter, 1);
    //         }
    //     }

    //     Set<Character> keys = ht.keySet();
    //     int length = 0;
    //     boolean odd = false;
    //     for(Character key: keys){
    //         length += (ht.get(key)/2) *2;
    //         if(ht.get(key)%2 == 1){
    //             // length--;
    //             odd = true;
    //         }
    //     }
    //     if(odd){
    //         length+= 1;
    //     }

    //     return length;

    // }
}
