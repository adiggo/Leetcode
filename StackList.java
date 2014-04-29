public class StackList<T>{
        
    //top is the top element in the stack
    //which need to stored
    private class Node<T>{
        T data;
        Node<T> next;
        public Node<T>(T t){
            this.data = t;
        }
    }

    Node<T> top;
    T pop(){
        if (top != null){
            T t = top.data;
            top = top.next;
            return t;
        }
        return null;
    }

    void push(T t){
        Node<T> temp = top;
        top = new Node<T>(t);
        top.next = temp;
    }
    T peek(){
        return top.data;}

}



