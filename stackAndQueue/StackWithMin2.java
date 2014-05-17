/**
 *
 *  Use constant time and constant space to get the min the stack
 *  Why we use another stack to keep the information of min is 
 *  that min element should be not that large in large data sets
 */

public class StackWithMin2 extends Stack<Integer>{
    // new a stack out to keep all min information in the stack
    public StackWithMin2(){
        Stack<Integer> s = new Stack<Integer>();
    }
    // push the element in the super stack, but only push 
    // the min element in the s stack
    public void push(int value){
        super.push(value);
        if (value < min()){
            s.push(value);
        }
    }

    public Integer pop(){
        int popValue = super.pop();
        if (popValue = min())
            s.pop();
        return popValue;
    }
    
    public int min(){
        if (s.isEmpty())
            return Integer.MAX_VALUE;
        else
            return s.peek();
    }
}

    
