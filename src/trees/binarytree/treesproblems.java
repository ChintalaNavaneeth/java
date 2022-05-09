package trees.binarytree;


//1 . count nodes in a tree
//2 . SUM OF NODES
//3 .  height if tree
//4 . Max in nodes
//5 . subtree of another subtree
//6 . sum of nodes at k th level

import java.util.LinkedList;
import java.util.Queue;

public class treesproblems
{
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
            if(nodes[idx] == -1) return null;

            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
        }
    }
    public static int countnodes(Node root)
    {
        int x=0,y=0;
        if (root == null) return 0;
        x += countnodes(root.left);
        y += countnodes(root.right);

        return x+y+1;
    }

    public static int sumofnodes(Node root)
    {
        int x = 0, y=0;
        if (root == null) return 0;
        x += sumofnodes(root.left);
        y += sumofnodes(root.right);

        return x+y+root.data;
    }

    public static int height(Node root)
    {
        int x = 0, y = 0;
        if (root == null) return 0;
        x += height(root.left);
        y += height(root.right);

        return Math.max(x,y) + 1;
    }

    public static int diameter(Node root) // O(n^2)
    {
        if (root == null) return 0;
        int d1 = diameter(root.left);
        int d2 = diameter(root.right);
        int d3 = height(root.left) + height(root.right) +1;

        return Math.max(d3,Math.max(d1,d2));

    }
    static class treeinfo
    {
        int height;
        int diameter;

        treeinfo(int height, int diameter)
        {
            this.height = height;
            this.diameter = diameter;
        }
    }

    public static treeinfo diameter2(Node root) // O(n)
    {
        if (root == null) return new treeinfo(0,0);

        treeinfo left = diameter2(root.left);
        treeinfo right = diameter2(root.right);

        int myheight = Math.max(left.height, right.height) + 1;

        int daim1 = left.diameter;
        int daim2 = right.diameter;

        int mydiam = left.height + right.height + 1;

        treeinfo tre = new treeinfo(myheight,mydiam);
        return tre;

    }

    public static int sumatk(Node root, int k)
    {
        int h = 0,s = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty())
        {
            Node curnode = q.remove();
            if (curnode == null)
            {
                h++;
//                System.out.println();
                if (q.isEmpty()) break;
                else q.add(null);
            }
            else
            {
                if (k == h) s += curnode.data;
//                System.out.print(curnode.data+ " ");
                if (curnode.left != null) q.add(curnode.left);
                if (curnode.right != null) q.add(curnode.right);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree  = new binarytree();
        Node root = tree.buildtree(nodes);
//        System.out.println(countnodes(root));
//        System.out.println(sumofnodes(root));
//        System.out.println(height(root));
//        System.out.println(maxnode(root));
//        System.out.println(diameter(root));
//        System.out.println(diameter2(root).diameter);
        System.out.println(sumatk(root,2));


    }
}
