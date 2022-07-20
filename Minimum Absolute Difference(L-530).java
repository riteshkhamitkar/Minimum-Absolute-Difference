class Solution {
    public int getMinimumDifference(TreeNode root) {
        
        Stack<TreeNode> st = new Stack<>();
        
        TreeNode curr = root;
        TreeNode prev = null;
        
        int res = Integer.MAX_VALUE;
        
        while(curr !=null || !st.isEmpty()){
            if(curr != null){
                st.push(curr);
                curr = curr.left;
            }
            else{
                curr = st.pop();
                if(prev != null) res = Math.min(res, curr.val-prev.val);
                prev = curr;
                curr = curr.right;
            }
        }
        return res;
        
    }
}