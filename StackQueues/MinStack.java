/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interviewprep.StackQueues;

/**
 *
 * @author jakadam
 */

import java.util.*;
public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    int min= Integer.MAX_VALUE;
    
    /*
    -    for all functions, ask the questioner, what should be the output if stack is empty.
    -    Ideas is - when we see that the next incoming ele is smaller than existing min, 
                    we do 2 push operations.
                                - 1. push min on stack
                                - 2. push incoming ele
                    and then update the min variable with in coming ele.
    - Pushing 2 eles in above case helps us get the next minimum in stack, when we perform a pop()
      which causes the removal of current minimum from stack.
    */
    public void push(int x) {
        
        if(x<=min){
            stack.push(min);
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.isEmpty()==true){
            //do nothing
        }
        else{
            int ele=stack.pop();
            if(ele==min)
                min=stack.pop();
        }
    }

    public int top() {
        if(stack.isEmpty()==true){
            return -1;
        }
        else{
            int top= stack.peek();
            return top;
        }
    }

    public int getMin() {
        if(stack.isEmpty()==true){
            return -1;
        }
        else{
            return min;
        }
    }
}

/*
Link-https://www.interviewbit.com/problems/min-stack/
Notes-
https://leetcode.com/problems/min-stack/discuss/49014/Java-accepted-solution-using-one-stack

explanation in notebook

alternate approach
https://www.youtube.com/watch?v=8Ub73n4ySYk

refer complete solution section for solution using 2 stacks
*/