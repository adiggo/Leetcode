public class QueueList<T>{
    private class Node<T>{
        Node<T> next;
        T value;
        public Node<T>(){
            value = null;
        }
        public Node<T>(T data){
            this.value = data;
        }
    }
    Node<T> first, last;
    
    void enqueue(T input){
        if (first == null){
            first =new Node<T> input;
            last = input;
        }else{
            Node<T> temp = last;
            Node<T> last = new Node<T>(intput);
            temp.next = last;
        }
    }

    T dequeue(){
        if (first == null){
            return null;
        }
        else{
            T output = first.value;
            first = first.next;
            return output;}
    }
}
            
        
