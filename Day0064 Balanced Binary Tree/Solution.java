class Solution {
    public boolean isBalanced(TreeNode root) {
         if (root == null) {
      return true;
    }
    Map<TreeNode, Integer> map = new HashMap<>();
    int leftHeight = getHeight(root.left, map);
    int rightHeight = getHeight(root.right, map);
    if (Math.abs(leftHeight - rightHeight) > 1) {
      return false;
    }
    return isBalanced(root.left) && isBalanced(root.right);
  }
  
  private int getHeight(TreeNode root, Map<TreeNode, Integer> map) {
    if (root == null) {
      return 0;
    }
    if (map.containsKey(root)) {
      return map.get(root);
    }
    int height = 1 + Math.max(getHeight(root.left, map), getHeight(root.right, map));
    map.put(root, height);
    return height;
  
    }
}
