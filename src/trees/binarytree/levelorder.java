package trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class levelorder {
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree
    {
        static int idx = -1;
        public static Node buildTree(int []nodes)
        {
            idx++;
            if (nodes[idx] == -1) return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    public static void levelordertraversal(Node root)
    {
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty())
        {
            Node currNode = q.remove();

        }

    }

    public static void main(String[] args) {
        int []nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
    }
}
