package leetcode;

public class Solution_617_mergeTrees {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return merge(t1, t2);
    }

    public static TreeNode merge(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return null;
        }
        if (node1 != null && node2 == null) {
            return node1;
        }
        if (node1 == null && node2 != null) {
            return node2;
        }
        TreeNode node = new TreeNode(node1.val + node2.val);
        node.left = mergeTrees(node1.left, node2.left);
        node.right = mergeTrees(node1.right, node2.right);
        return node;
    }
}
