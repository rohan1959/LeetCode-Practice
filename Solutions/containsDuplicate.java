Problem : 

Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, 
and it should return false if every element is distinct.

Solution : 

public class Solution {
    public boolean containsDuplicate(int[] nums) {
    
    HashSet<Integer> hash = new HashSet<>();
    
    for(int i =0;i<nums.length;i++){
    	if(!hash.add(nums[i]))
    		return true;
    }
    	return false;	
    }
    
}