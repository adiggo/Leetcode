/**
 *
 *  Given a stack, get a ascending order stack.
 *  This can be derived by using a new stack. If the popped value of value of the old stack is smaller than the 
 *  new stack's top element, then we need to use a while, until popped value is larger than it or new stack is empty.
 *  so the old one need to push all the element pop by the new one, so that the optimal small element is pushed into the
 *  stack. 
 */

public class StackForAscending{

    public StackForAscending(){
        Stack<Integer> t = new Stack<Integer>();
    }


    /**
     *
     *  Sort the stack, based on the ascending property. 
     *  Here, we do it in a O(n^2) time since we need to use two loop.
     *
     */
    public Stack<Integer> sort(Stack<Integer> s){
        while(!s.isEmpty()){
            int tmp = s.pop();
            // we can't use a pop() here since pop() will pop out the element
            // here is for checking the condition
            // so we need to consider the result of t.peek() smaller than tmp.
            // in that case, if we use pop(), then we need to use a variable to 
            // keep record of all elements
            while(!r.isEmpty() && t.peek() > tmp){
                s.push(t.pop());
            }
            t.push(tmp);
        }
        return t;
    }
}
