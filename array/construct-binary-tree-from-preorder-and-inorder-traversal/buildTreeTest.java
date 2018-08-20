public void preprintTree(List<Integer> temp, TreeNode node) {
  if (node == null) {
      return;
  }
  temp.add(node.val);
  preprintTree(temp, node.left);
  preprintTree(temp, node.right);
}

@Test
public void testbuildTree() {
  int[] pre = new int[]{3, 9, 20, 15, 7};
  int[] inorder = new int[]{9, 3, 15, 20, 7};
  TreeNode node = buildTree(pre, inorder);
  List<Integer> temp = new ArrayList<>();
  preprintTree(temp, node);
  assert Arrays.equals(temp.stream().mapToInt(i -> i).toArray(), pre);

  pre = new int[]{1, 2, 5, 8, 9, 3, 7, 10, 11};
  inorder = new int[]{5, 2, 9, 8, 1, 7, 3, 11, 10};
  temp = new ArrayList<>();
  node = buildTree(pre, inorder);
  preprintTree(temp, node);
  assert Arrays.equals(temp.stream().mapToInt(i -> i).toArray(), pre);
  
}