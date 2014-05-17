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

    public Stack<Integer> sort(Stack<Integer> s){
        while(!s.isEmpty()){
            int tmp = s.pop();
            while(!r.isEmpty() && t.peek() > tmp){
                s.push(t.pop());
            }
            t.push(tmp);
        }
        return t;
    }
}
