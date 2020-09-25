package info.nj005py.exercise.week3;

import info.nj005py.exercise.day.ConstructBinaryTreeInorderPostorder;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreePreorderInorder {

    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            indexMap.put(inorder[i],i);
        }
        return myBuildTree(preorder,inorder,0,n - 1,0,n - 1);
    }

    private TreeNode myBuildTree(int[] preorder, int[] inorder, int preorderLeft, int preorderRight,
                                 int inorderLeft, int inorderRight) {
        if (preorderLeft > preorderRight) {
            return null;
        }
        int preorderRoot = preorderLeft;
        int inorderRoot = indexMap.get(preorder[preorderRoot]);
        TreeNode root = new TreeNode(preorder[preorderRoot]);
        int sizeLeftSubtree = inorderRoot - inorderLeft;
        root.left = myBuildTree(preorder,inorder,inorderLeft + 1,preorderLeft + sizeLeftSubtree,
                inorderLeft,inorderRoot - 1);
        root.right = myBuildTree(preorder,inorder,preorderLeft + sizeLeftSubtree + 1,preorderRight,
                preorderRoot + 1,inorderRight);
        return root;
    }

    //solution2
    public TreeNode buildTree2(int[] preorder,int[] inorder) {
        return helper(0,0,inorder.length - 1,preorder,inorder);
    }

    private TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if (preStart > preorder.length - 1 || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]);
        int inIndex = 0;
        for (int i = inStart; i <= inEnd; i++) {
            if (inorder[i] == root.val) {
                inIndex = i;
            }
        }
        root.left = helper(preStart + 1,inStart,inIndex - 1,preorder,inorder);
        root.right = helper(preStart + inIndex - inStart + 1,inIndex + 1,inEnd,preorder,inorder);
        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
