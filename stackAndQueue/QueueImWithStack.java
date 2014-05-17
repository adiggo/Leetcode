/**
 *
 * Major difference between queue and stack is the order
 * So we need to use two stack to implement a queue  
 * The first stack perform push, the next stack pop the most oldeset element.
 *
 */

public class QueueImWithStack<T>{
    
    public QueueImWithStack(){
        Stack<T> s1 = new Stack<T>();
        Stack<T> s2 = new Stacl<T>();
    }
    /**
     *
     *add elements in s1
     */
    public void add(T t){
        s1.push(t);
    }
    
    /**
     *
     *If s2 is empty, move element from s1 to s2,
     *reverse the order.
     */
    public void shift(){
        if (s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
    }
    
    /**
     * Get the first element in the queue
     *
     */
    public T peek(){
        shift();
        return s2.peek();
    }

    /**
     *
     *  Remove the first element in queue
     *
     */
    public T remove(){
        shift();
        return s2.pop();
    }

}        
    






