public Node nodeWithParent(Node a, Node b){
    HashSet<Node> s = new HashSet<Node>();

    while(a != null){
        s.add(a);
        a = a.parent;
    }
    while(b != null){
        if (s.contains(b))
            return b;
        b = b.parent;
    }
    return null;
}
// better solution
public Node nodeWithP (Node p, Node q){
    HashSet<Node> s = new HashSet<Node>();
    while(p != null || q != null){
        if (p != null){
            if (!s.add(p))
                return p;
            p = p.parent;
        }
        if (q){
            if (!s.add(q))
                return q;
            q = q.parent;
        }
    }
    return null;
}


//running time is O(h), however, space complexity is O(h);
int getHeight (Node p){
    int height = 0;
    while(p){
        height++;
        p = p.parent;
    }
    return height;
}
// the height is the height from root to node
Node LCA (Node p, Node q){
    int h1 = getHeight(p);
    int h2 = getHeight(q);
    
    if (h1 > h2){
        for (int h = 0; h < h1 - h2); h++)
            p = p.parent;
    }else{
        for (int h = 0; h < h2 - h1; h++)
            q = q.parent;
    }
    while(p != null && q != null){
        if (p == q)
            return p;
        p = p.parent;
        q = q.parent;
    }
    return null;
}



