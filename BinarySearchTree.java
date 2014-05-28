
public class BinarySeachTree{
    
    //1. search for a place to put new element;
    //2. insert the new element to this place;
    private BSTNode root;
    public BinarySeachTree(){
        root = null;
    }

    public boolean add(int value){
        if (root == null){ //incase that root is null
            root = new BSTNode(value);
            return true;
        }
        else{
            return root.add(value);
        }
    }

    public boolean remove(int value){
        if (root == null){
            return false;
        }
        else{
            if (root.getValue() == value){
                BSTNode newRoot = new BSTNode(0);
                newRoot.left = root;
                boolean result = root.remove(value, newRoot);
                root = newRoot.left;
                return result;
            }else{
                return root.remove(value, null);
            }
        }
}

// detailed implementing is in BSTNode class.
public class BSTNode{
    private int value;
    private BSTNode left;
    private BSTNode right;
    //constructor
    public BSTNode(int value){
        this.value = value;
        left = null;
        right = null;
    }
    public boolean add(int value){
        if (value == this.value){
            return false;
        }
        else if (value < this.value){
            if (left == null){
                left = new BSTNode(value);
                return true;
            }else     // do it recursely
                return left.add(value);
        }else if (value > this.value){
            if (right == null){
                right = new BSTNode(value);
                return true;
            }else{
                return right.add(value);   // do it recursely
            }
            return false;
        }
    }

    boolean remove(int value, BSTNode parent){
        if (value < this.value){
            if (left != null)
                return left.remove(value, this);
            else
                return false;
            }else if (value > this.value) {
                if (right != null)
                    return right.remove(value, this);
                else
                    return false;
            }else{
                if (left != null && right != null){
                    this.value = right.minValue();
                    right.remove(this.value, this);
                }else if (parent.left == this){
                    parent.left = (left != null) ? left : right;
                }else if (parent.right == this){
                    parent.left = (left != null) ? left : right;
                }
                else if (parent.right == this){
                    parent.right = (left != null) ? left : right;
                }
                return true;
            }
    }
    public int minValue(){
        if (left = null)
            return value;
        else
            return left.minValue();
    }
}






