package data_structures.trees;

/**
 * Created by Miguel on 11/9/15.
 */
public class TreeMethods {

    /*
     * Node is defined as
     */
    class Node {
        int data;
        Node left;
        Node right;
    }

    /*
     * Preorder Traversal
     */
    void Preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }
    }

    /*
     * Postorder Traversal
     */
    void Postorder(Node root) {
        if (root != null) {
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    /*
     * Inorder Traversal
     */
    void Inorder(Node root) {
        if (root != null) {
            Inorder(root.left);
            System.out.print(root.data + " ");
            Inorder(root.right);
        }
    }
}
