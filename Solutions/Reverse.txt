/**
Question : 

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21

**/


class Solution {
public int reverse(int x) {
    
	int temp =0;
	long revNum=0;
	while (x!=0)
	{
		temp = x%10;
		revNum = revNum*10 + temp;
		x=x/10;
		
	}
	if( revNum>Integer.MAX_VALUE || revNum < Integer.MIN_VALUE)
	    return 0;
	else 
        return (int)revNum;
}
}