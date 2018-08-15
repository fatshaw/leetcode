public TreeNode buildTree(int[] postorder, int startPostorder, int[] inorder, int startInorder, int endInorder) {
  if (startInorder == endInorder) {
      return null;
  }
  int root = postorder[startPostorder];
  TreeNode treeNode = new TreeNode(root);
  int left = startInorder;
  for (; left < endInorder; left++) {
      if (inorder[left] == root) {
          break;
      }
  }
  treeNode.right = buildTree(postorder, startPostorder - 1, inorder, left + 1, endInorder);
  treeNode.left = buildTree(postorder, startPostorder - endInorder + left, inorder, startInorder, left);
  return treeNode;
}


public TreeNode buildTree(int[] inorder, int[] postorder) {
  return buildTree(postorder, postorder.length - 1, inorder, 0, inorder.length);
}