import java.util.*;

public class QueueLinkedList<T>{
	LinkedList<T> list = new LinkedList<T>();
	
	private Node first, last;
	private int total;
	public QueueLinkedList(){
		first = null;
		last = null;
		total = 0;
	
	}
	private static class Node{
		private static T ele;
		private static Node next;
	}
	
	public void engueue(T ele){
		Node current = last;
		last = new Node();
		last.ele=ele;
			
		if (total++ == 0) first = last;
		else current.next = last;
		
		}
		
		public T dequeue(){
			if (total == 0){
				throw new java.util.NoSuchElementException();
		
			T ele = first.ele;
			first = first.next;
			if (--total == 0) last = null;
			return ele;
		    }
            		T ele = first.ele;
			first = first.next;
            return ele;
		
		
	}
}
	  
/*
	public void enqueue(T q){
		list.add(q);
	}
	
	public T dequeue(){
		T t = list.poll();
	}

}*/
	
