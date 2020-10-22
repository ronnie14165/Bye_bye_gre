package leetcode;

public class Solution_700_searchBSTCorrect {
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

    public static TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                break;
            } else if (val > root.val) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return root;

    }


}
