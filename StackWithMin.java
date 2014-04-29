public class StackWithMin extends Stack<Integer>{
    Stack<Integer> s2;
    public StackWithMin(){
        s2 = new Stack<Integer>();
    }
    // use stack to keep sure that push and pop works just at time
    // so we are use two stacks to achieve our information
    // so super keeps all the element, s2 is an additional array to store min
    public void push(int value){
        if (value <= min()){
            s2.push(value);
        }
        super.push(value);
    }

    public Integer pop(){
        int value = super.pop();
        if (value == min()){
            s2.pop();
        }
        return value;
    }
    
    public int min(){
        if (s2.isEmpty()){
            return Integer.MAX_VALUE;
        else
            s2.peek();
        }
    }
}

