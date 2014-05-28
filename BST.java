import java.util.NoSuchElementException;
// first apply a template method
public class BST<Key extends Comparable<Key>, Value>{
	private Node root;

	//define a inner private class
	// a nested class is a member of its enclosing class
	// non-static nested classes have access to other member of the enclosing class
	// even if it is declared private.
	// static nested classes do not have access to other member of the enclosing class.
	// this is a way logically grouping the class.
	// in this case, we can avoid the changing of data in the Node, good design for OCP principal.  

	// so if I have not declared modifier, then the class is package private, visible only within its own package	
	private class Node{
		private Key key;
		private Valeu val;
		private Node left, right;
		private int N;  // number of nodes
		//define local field as private
		// this works as a set method to set local Node field. so for each object it just be created once.
		public Node(Key key, Value val, int N){
			this.key = key;
			this.val = val;
			this.N = N;
		}
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}
	public int size(){
		return size(root);
	}

	private int size(Node x){
		if (x == null) return 0;
		else return x.N;     //node is accessible within class, hidden information
	}	


	public void insert(Key key, Value val){
	// if value is null, then we just delete the key. and do nothing
		if (val == null){
			delete(key); return;
		}
		// return a root
		root = insert(root, key, val);
	//	assert check();
	}

	
	private Node insert(Node x, Key key, Value val){
		// if node  is null, then return a new node with its value
		if (x == null) return new Node(key, val, l);	
		int cmp = key.compareTo (x.key);
	// apply recursion in solving this problem
		if (cmp < 0) x.left = insert(x.left,key,val);
		else if (cmp > 0)x.right = insert(x.right, key, val);
		else    x.val = val;
		x.N = 1+size(x.left) + size(x.right);
		return x;
	}
	public void deleteMin(){
	  // throws nusuchElementexception		
		if (isEmpty()) throw new NoSuchElementException("Symbol table underflow");
		root = deleteMin(root);
	//	assert check();
	}
	
	private Node deleteMin(Node x){
		// go until x.left is null, then check right
		if (x.left == null) return x.right;
		// return x.left as x.left.right
		// keep bst property
		x.left = deleteMin(x.left);
		
		x.N = size(x.left) + size(x.right) +1;
		return x;
	}
	
	public void delete(Key key){
		root = delete(root, key);
		assert check();
	}
	
	//each time start from root
	private Node delete (Node x, Key key){
		if (x == null)  return null;
		
		int cmp = key.compareTo(x.key);
		if (cmp<0) x.left = delete(x.left, key);
		else if (cmp>0) x.right = delete (x.right, key);
		else{
			// find the minimum element in the right sub-tree
			if (x.right == null) return x.left;
			if (x.left == null) return x.right;
			Node t =x;
			x = min(t.right);
			// x the minimum Node (most left)
			x.right = deleteMin(t.right);
			x.left = t.left;
		}
		x.N = size(x.left) + size(x.right) +1;
		return x;
	}	
	
	public Key min(){
		if(isEmpty()) return null;
		return min(root).key;
	}
  // get the minimum value 

	private Node min(Node x){
		if (x.left == null) return x;
		else return min(x.left);
	}
}
