Problem :

Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that 
nums[i] = nums[j] and the absolute difference between i and j is at most k.

Solution :

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
    	HashMap<Integer,Integer> duplicates = new HashMap<>();
    	int i=0;
    	while(i<nums.length){
    		if(duplicates.containsKey(nums[i])){
    			if(i-duplicates.get(nums[i])<=k)
    				return true;
    		}
    		duplicates.put(nums[i], i);
    	    i++;
        }
    return false;	
    }
}
