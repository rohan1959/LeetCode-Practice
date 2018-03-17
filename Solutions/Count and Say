Problem : 
    The count-and-say sequence is the sequence of integers with the first five terms as following:

    1.     1
    2.     11
    3.     21
    4.     1211
    5.     111221
    1 is read off as "one 1" or 11.
    11 is read off as "two 1s" or 21.
    21 is read off as "one 2, then one 1" or 1211.
    Given an integer n, generate the nth term of the count-and-say sequence.

Solution :

public class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for(int i =1;i<n;i++){
        	s= cns(s);
        }
        return s;    
    }
    
    public String cns(String s){
    	StringBuilder Sb = new StringBuilder();
    	char c = s.charAt(0);
    	int count =1;
    	for (int i =1;i<s.length();i++){
    		if(s.charAt(i)== c){
    			count++;
    		}
    		else {
    			Sb.append(count);	
    			Sb.append(c);
    			count=1;
    			c = s.charAt(i);
    			
    		}
    	}
		Sb.append(count);
		Sb.append(c);
		return Sb.toString();    	
    }
}
