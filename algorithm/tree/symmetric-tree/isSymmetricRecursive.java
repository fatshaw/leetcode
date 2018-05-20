public boolean isSymmetric(TreeNode root) {
  if (root == null) {
      return true;
  }

  Stack<TreeNode> stack = new Stack<>();
  stack.push(root.left);
  stack.push(root.right);
  while (stack.size() > 0) {
      TreeNode left = stack.pop();
      TreeNode right = stack.pop();

      if (left == null && right == null) {
          continue;
      }
      if (left == null && right != null) {
          return false;
      }
      if (left != null && right == null) {
          return false;
      }
      if (left.val != right.val) {
          return false;
      }

      stack.push(left.right);
      stack.push(right.left);
      stack.push(left.left);
      stack.push(right.right);

  }

  return true;
}