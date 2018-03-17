Problem : 
    Implement strStr().

    Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

    Example 1:

    Input: haystack = "hello", needle = "ll"
    Output: 2
    Example 2:

    Input: haystack = "aaaaa", needle = "bba"
    Output: -1

Solution :

public class Solution {
    public int strStr(String haystack, String needle) {
        int len1= haystack.length();
        int len2 = needle.length();
        if(len2>len1 )
        	return -1;
        if(len2==0)
            return 0;
        for(int i =0;i<=len1-len2;i++){
        	if(haystack.substring(i, i+len2).equals(needle))
        		return i;
        }
	return -1;
        
    }
}