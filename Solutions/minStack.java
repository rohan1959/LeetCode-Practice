Problem : 

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.

Solution : 


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

public class MinStack {

    /** initialize your data structure here. */
	long min=Integer.MAX_VALUE;
	Stack<Long> stack;
   
    public MinStack() {
    	 stack = new Stack<>();   
    }
    
   public void push(int x) {
    	if(x<=min){
    		stack.push(min);
    		min=x;
    	}
    	stack.push((long) x);
    	
    }
    
    public void pop() {
        if(stack.pop()==min)
        min = stack.pop();
    }
    
    public int top() {
      long peek = stack.peek();
      return (int)peek;
    }
    
    public int getMin() {
        return (int)min;
    }
}
