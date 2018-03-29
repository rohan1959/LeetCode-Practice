Problem : 
    Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

    You may assume no duplicates in the array.

    Example 1:

    Input: [1,3,5,6], 5
    Output: 2
    Example 2:

    Input: [1,3,5,6], 2
    Output: 1
    Example 3:

    Input: [1,3,5,6], 7
    Output: 4
    Example 1:

    Input: [1,3,5,6], 0
    Output: 0

Solution : 

public class Solution {
    public int searchInsert(int[] nums, int target) {
        int s =0;
        int e = nums.length-1;
        int mid;
        while(e>=s){
            mid= (e+s)/2;
            
            if(nums[mid]==target)
            {
                return mid;
            }
            else if(target<nums[mid])
            {
                e = mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return s;
    }
}