class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();

        while(root!=null || !stack.isEmpty()){

            while(root!=null){
                res.add(root.val);
                stack.add(root);
                root = root.left;    
            }

            if(stack.isEmpty()){
                return res;
            }

            root = stack.pop();
            root = root.right;
        }
        return res;
    }
}
