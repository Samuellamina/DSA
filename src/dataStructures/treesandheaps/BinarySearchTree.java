package dataStructures.treesandheaps;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode (int value) {
        data = value;
        left = right = null;
    }
}
public class BinarySearchTree {
    TreeNode root;
    public void insert(int value) {
        root = insertIntoBinaryTree(root, value);
    }

    private TreeNode insertIntoBinaryTree(TreeNode root, int value) {
        if(root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insertIntoBinaryTree(root.left, value);
        } else if (value> root.data) {
            root.right = insertIntoBinaryTree(root.right, value);
        }
        return root;
    }

    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.println(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public void preorderTraversal(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    public void postorderTraversal(TreeNode node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    public int getHeight(TreeNode root) {
        if (root == null) {
            return -1; // Return -1 for height of empty tree
        }

        // Recursively get the height of the left and right subtrees
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        // Return the maximum of the two heights plus one for the current node
        return Math.max(leftHeight, rightHeight) + 1;
    }

}
