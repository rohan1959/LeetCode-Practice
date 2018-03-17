Problem :

    Write a program to check whether a given number is an ugly number.

    Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not
    ugly since it includes another prime factor 7.

    Note:

    1 is typically treated as an ugly number.
    Input is within the 32-bit signed integer range.

Solution : 

public class Solution {
    public boolean isUgly(int num) {
        if(num<=0)
            return false;
        else{
            for(int i=2;i<6;i++){
                while(num%i==0)
                num=num/i;
            }
            if(num==1)
                return true;
            else 
                return false;
        }
    }
}