 struct tree {
    int value;
    struct tree *left, *right;
  }

  int Calculate(struct tree *r) {
    if (!r) return 0;
    // so code should be build from top
    // but think edge case from bottom
    int a = Calculate(r->left);
    int b = Calculate(r->right);
    return ((a > b ? a : b) + 1);
  }
