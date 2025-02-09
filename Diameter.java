public class Diameter {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
        
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    
    static class Solution {
        int md = 0;
        
        int height(TreeNode node) {
            if (node == null) return 0;
            int lh = height(node.left);
            int rh = height(node.right);
            md = Math.max(md, lh + rh);
            return Math.max(lh, rh) + 1;
        }
        
        public int diameterOfBinaryTree(TreeNode root) {
            height(root);
            return md;
        }
    }
    
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        Solution solution = new Solution();
        int diameter = solution.diameterOfBinaryTree(root);
        System.out.println("Diameter of the Binary Tree: " + diameter);
    }
}
