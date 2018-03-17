Problem : 
    Determine whether an integer is a palindrome. Do this without extra space.

Solution : 

public class Solution {
    public boolean isPalindrome(int x) {
    
    if(x<0 ){
        return false; 
    }    
    int temp = x;
    int rev=0 ,rem=0;
    while(x>0)
    {
      rem = x%10;
      rev = (rev*10)+rem;
      x = x/10;
    }        
    
    return rev == temp;
    }
}