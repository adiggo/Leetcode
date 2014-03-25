int countMatchesPQ(Node *root, Node *q, Node*q){
// base case
	if (!root) return 0;
	int matches = countMatchesPQ(root->left,p,q) + countMatchesPQ(root->right,p,q);
// logic
	if (root == p || root == q){
		matches = 1+matches;
	}else{
		return matches;
	}

Node *LCA(Node *root, Node *p, Node *q){
	if (!root || !p || !q) return NULL;
	if (root == p || root == 1) return root;
	int totalMatches =  countMacthesPQ(root->left,p,q);
	if (totalMatches == 1)
		return root;
	else if(totalMatches == 2)
		return LCA(root->left,p,q);   // recursion to next root.left since it is must be a parent of two nodes
	else
		return LCA(root->right,p,q)     // if left subtree contains either p or q, then the right tree is the same

