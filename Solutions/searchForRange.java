Problem :
    Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

    Your algorithms runtime complexity must be in the order of O(log n).

    If the target is not found in the array, return [-1, -1].

    For example,
    Given [5, 7, 7, 8, 8, 10] and target value 8,
    return [3, 4].

Solution :

public class Solution {
    
    public int[] searchRange(int[] nums, int target) {
     
    	int [] result = new int[2] ;
    	
    	result[0]= First(nums, target);
    	result[1]= Second(nums, target);
    	
    	return result;
    }
    
    public int First(int[]nums ,int target){
    	int index =-1;
    	int first =0; 
    	int last = nums.length-1;
    	while(first<=last){
    		
    		int mid = first+((last-first)/2);
    		if(target <= nums[mid]){
    			last = mid-1;
    		}
    		else{
    			first = mid+1;
    		}
    		if(target == nums[mid])
    			index = mid;
    		
    	}
    	return index;
    }
    
    public int Second(int[]nums ,int target){
    	int index =-1;
    	int first =0; 
    	int last = nums.length-1;
    	while(first<=last){
    		
    		int mid = first+((last-first)/2);
    		if(target>= nums[mid]){
    			first  = mid+1;
    		}
    		else{
    			last = mid-1;
    		}
    		if(target == nums[mid])
    			index = mid;
    	}
    	return index;
    	
    }
    
}
