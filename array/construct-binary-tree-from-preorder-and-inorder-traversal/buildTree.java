public TreeNode buildTree(int[] preorder, int startPreorder, int[] inorder, int startInorder, int endInorder) {
  if (startInorder == endInorder) {
      return null;
  }
  int root = preorder[startPreorder];
  TreeNode treeNode = new TreeNode(root);
  int left = startInorder;
  for (; left < endInorder; left++) {
      if (inorder[left] == root) {
          break;
      }
  }
  treeNode.left = buildTree(preorder, startPreorder + 1, inorder, startInorder, left);
  treeNode.right = buildTree(preorder, startPreorder + 1 + left - startInorder, inorder, left + 1, endInorder);
  return treeNode;
}


public TreeNode buildTree(int[] preorder, int[] inorder) {
  return buildTree(preorder, 0, inorder, 0, inorder.length);
}