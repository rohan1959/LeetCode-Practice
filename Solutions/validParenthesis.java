Problem :
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

Solution : 

public class Solution {
       public boolean isValid(String s) {
    	
    	Stack<Character> store= new Stack<Character>();
    	
    	int n=0;
    	if(s.length()%2!=0){
    	    return false;
    	}
		while(n<s.length()){
    		if(s.charAt(n)== '{')
			store.push('}');
    		else if( s.charAt(n)== '(')
    			store.push(')');
    		else if( s.charAt(n)=='[')
    			store.push(']');
    		else if( store.isEmpty()|| store.pop()!= s.charAt(n))
    			return false;
    		n++;
    		
    	}
		return store.isEmpty();
        
    }

}