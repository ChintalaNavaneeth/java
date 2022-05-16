package trees.binarysearchtree;


public class bst {
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

    public static class binarysearchtree
    {
        public static Node buildtree(Node node, int x)
        {
            if (node == null)
            {
                node = new Node(x);
            }
            if (x < node.data)
            {
                node.left = buildtree(node.left,x);
            }
            if (x > node.data)
            {
                node.right = buildtree(node.right,x);
            }
            return node;
        }
    }


    public static void main(String[] args) {
        binarysearchtree tree = new binarysearchtree();
        Node root =null;

        //build binary search tree
        int a[] = {8,3,6,10,4,7,1,14,13};
        for (int i = 0; i < a.length; i++) {
            root = tree.buildtree(root,a[i]);
        }





    }
}
