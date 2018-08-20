@Test
public void testbuildTree() {
    int[] post = new int[]{9, 15, 7, 20, 3};
    int[] inorder = new int[]{9, 3, 15, 20, 7};
    TreeNode node = new BuildTree().buildTree(inorder,post);
    List<Integer> temp = new ArrayList<>();
    preprintTree(temp, node);
    assert Arrays.equals(temp.stream().mapToInt(i -> i).toArray(), new int[]{3, 9, 20, 15, 7});

    post = new int[]{5,15,7,2,8,12,11,4,1};
    inorder = new int[]{5,2,15,7,1,8,4,12,11};
    node = new BuildTree().buildTree(inorder,post);
    temp = new ArrayList<>();
    preprintTree(temp, node);
    assert Arrays.equals(temp.stream().mapToInt(i -> i).toArray(), new int[]{1,2,5,7,15,4,8,11,12});
}