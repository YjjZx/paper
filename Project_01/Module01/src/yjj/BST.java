package yjj;

import java.util.ArrayList;
import java.util.List;

public class BST {
    public static void main(String[] args) {

    }

}

class Solution {
    public void isValid(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        isValid(root.left, res);
        res.add(root.val);
        isValid(root.right, res);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val, int i, int i1) {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.left = left;
        this.right = right;
    }
}
