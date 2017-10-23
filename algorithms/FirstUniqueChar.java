package leetcode.algorithms;

/**
 * Created by kevinyan on 10/22/17.
 */

/*
Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
 */

 public class FirstUniqueChar{
 	public int firstUniqChar(String s) {
        Hashtable<Character,Integer> ht = new Hashtable<>();
        for(int i=0; i<s.length(); i++){
            char key = s.charAt(i);
            if(ht.containsKey(key)){
                ht.put(key, ht.get(key)+1);
            }else{
                ht.put(key, 1);
            }
            
        }
        for(int i=0; i<s.length(); i++){
            char key = s.charAt(i);
            if(ht.get(key) == 1) return i;
        }
        return -1;
    }
 }