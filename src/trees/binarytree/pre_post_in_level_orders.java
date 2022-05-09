package trees.binarytree;

import java.util.*;


public class pre_post_in_level_orders {
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

    public static class binarytrees
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

    public static void printpreorder(Node root)
    {
        if (root == null) return;

        System.out.print(root.data+ " ");
        printpreorder(root.left);
        printpreorder(root.right);
    }
    public static void printpostorder(Node root)
    {
        if (root == null) return;

        printpostorder(root.left);
        printpostorder(root.right);
        System.out.print (root.data + " ");
    }

    public static void printinorder(Node root)
    {
        if (root == null) return;

        printinorder(root.left);
        System.out.print(root.data + " ");
        printinorder(root.right);
    }

    public static void printlevelorder(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty())
        {
            Node currnode = q.remove();
            if (currnode == null)
            {
                System.out.println();
                if (q.isEmpty()) break;
                else q.add(null);
            }
            else
            {
                System.out.print(currnode.data + " ");
                if (currnode.left != null) q.add(currnode.left);
                if (currnode.right != null) q.add(currnode.right);
            }

        }
    }


    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytrees tree = new binarytrees();
        Node root = tree.buildtree(nodes);
        System.out.println(root.data);

        printpreorder(root);
        System.out.println("preorder");

        printpostorder(root);
        System.out.println("postorder");

        printinorder(root);
        System.out.println("inorder");

        printlevelorder(root);
        System.out.println("level order");

    }
}
