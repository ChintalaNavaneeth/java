package trees.binarytree;

public class max_path_sum {
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

    static class binarytree
    {
        static int idx = -1;
        static Node buildtree(int n[])
        {
            idx++;

            if (n[idx] == -1) return null;

            Node newnode = new Node(n[idx]);
            newnode.left = buildtree(n);
            newnode.right = buildtree(n);


            return newnode;
        }
    }
    static int max = Integer.MIN_VALUE;
    public static int maxPathSum(Node root) {
        findMax(root);
        return max;
    }

    public static int findMax(Node root){
        if(root == null)
            return 0;
        int left = findMax(root.left) + root.data;
        int right = findMax(root.right) + root.data;
        boolean leftMax = true;
        if(left > right){
            root.data = left > root.data ? left : root.data;
        }
        else{
            root.data = right > root.data ? right : root.data;
            leftMax = false;
        }
        if(root.data > max)
            max = root.data;
        if(leftMax){
            if(root.right != null && root.data + root.right.data > max)
                max = root.data + root.right.data;
        }
        else{
            if(root.left != null && root.data + root.left.data > max)
                max = root.data + root.left.data;
        }
        return root.data;
    }

    public static void main(String[] args) {
        int nodes[] = {-10,9,-1,-1,20,15,-1,-1,7,-1,-1};
        binarytree tree = new binarytree();
        Node root = tree.buildtree(nodes);
        System.out.println(maxPathSum(root));
    }
}
