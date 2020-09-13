package info.nj005py.exercise.week2;

import java.util.*;

public class NAryTreePreOrderTraversal {
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (root == null) {
            return output;
        }
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.add(node.val);
            Collections.reverse(node.children);
            for (Node item : node.children) {
                stack.add(item);
            }
        }
        return output;
    }

    public List<Integer> preorder2(Node root) {
        List<Integer> res = new ArrayList<>();
        dfs(res,root);
        return res;
    }

    public void dfs(List<Integer> res,Node root) {
        if (root == null) return ;
        res.add(root.val);
        for (Node r : root.children) {
            dfs(res,r);
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
