package trees.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class leftviewbt {
    public static class Node
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

    public static class binarytree
    {
        static int idx = -1;
        static Node buildtree(int []nodes)
        {
            idx++;
            if (nodes[idx] == -1) return null;

            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);
            return newnode;
        }
    }
    public static void leftviewtree(Node root)
    {

        if (root == null)
            return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
            while (!queue.isEmpty()) {
                // number of nodes at current level
                int n = queue.size();

                // Traverse all nodes of current level
                for (int i = 1; i <= n; i++) {
                    Node temp = queue.poll();

                    // Print the left most element at
                    // the level
                    if (i == 1)
                        System.out.print(temp.data + " ");

                    // Add left node to queue
                    if (temp.left != null)
                        queue.add(temp.left);

                    // Add right node to queue
                    if (temp.right != null)
                        queue.add(temp.right);
                }
            }
        }




    public static void main(String[] args) {
        int nodes[] = {1,2,-1,-1,3,4,-1,-1,-1};
        binarytree tree = new binarytree();
        Node root = tree.buildtree(nodes);
        leftviewtree(root);

    }
}
