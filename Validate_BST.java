class Solution {
    public boolean isValidBST(TreeNode root) {
       return BST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean BST(TreeNode node,long min,long max){
        if(node==null)return true;
        if(node.val<=min || node.val>=max)return false;
        return BST(node.left,min,node.val)&& BST(node.right,node.val,max);
    }
}
