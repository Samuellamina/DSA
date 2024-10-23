package dataStructures.treesandheaps;
public class Trees {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(20);
        bst.insert(30);
        bst.insert(40);
        System.out.print("Inorder traversal: ");
        bst.inorderTraversal(bst.root);
        System.out.print("Postorder traversal: ");
        bst.postorderTraversal(bst.root);
        System.out.print("Preorder traversal: ");
        bst.preorderTraversal(bst.root);
    }
}
