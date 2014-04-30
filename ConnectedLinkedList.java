public class ConnectedLinkedList{
    
    public Node getConnected(Node n1, Node n2){
        Node first1 = n1;
        int l1 = 0;
        while(n1.next != null){
            n1 = n1.next;
            l1++;
        }

        l1;
        //make circle
        n1.next = first1;
        Node first2 = n2;
        for (int i = 0; i < l1; i++){
            n2 = n2.next;
        }

        while (n2 != first2){
            n2 = n2.next;
            first2 = first2.next;
        }
        return n2;
    }
}



        
