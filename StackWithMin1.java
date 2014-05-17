/**
 *
 *This class provides a method to get the
 *min in constant time. This method makes each node in the stack knows
 *its min element.
 *However, this cost a linear space complexity
 *
 *
 */

public class StackWithMin1 extends Stack<NodeWithMin>{
        
    public void push(int value){
        // get the min from the input
        int minTemp = Math.min(value, min());
        // push the element into stack
        super.push(new NodeWithMin(value,minTemp));
    }
    /**
     *
     *Get the min element, if stack is null, return the max_integer
     */
    public int min(){
        // condition check
        if (this.isEmpty()){
            return Integer.MAX_VALUE;
        }else{
            return super.peek().min;
        }
    }
// node with two value, one is its true value, another is its min value;
    class NodeWithMin{
        public int value;
        public int min;
        public NodeWithMin(int v, int min){
            value = v;
            this.min = min;
        }
    }


}






