https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/  
第一次一次通过，开心  
思路：前序遍历第一个元素一定是根节点，然后在中序遍历中找到该元素，则该元素左边的元素为根节点的左子树，右边的元素为右子树。然后不断递归这个逻辑，直到中序遍历的数组为空