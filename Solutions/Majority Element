Problem : 
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.


Solution :

public class Solution {
      public int majorityElement(int[] nums) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	int ret=0;
    	for(int i :nums){
    		if(!map.containsKey(i)){
    			map.put(i, 1);
    		}
    		else{
    			map.put(i,map.get(i)+1);
            }
    		if(map.get(i)> nums.length/2)
    			ret = i;	
    	}	
    	return ret;
    	
    }
}