Problem : 
    Implement pow(x, n).


    Example 1:

    Input: 2.00000, 10
    Output: 1024.00000
    Example 2:

    Input: 2.10000, 3
    Output: 9.26100

Solution : 

public class Solution {
    double myPow(double x, int n) {
        
    if (n < 0) 
        return 1 / (x*myPow(x, -(++n)));
    else if (n == 0) 
        return 1;
    
    else 
        return (n % 2 == 0) ? myPow(x*x, n / 2) : x*myPow(x*x, n / 2);     
    }
}