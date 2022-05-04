public class BinaryTreeApp {

    public static void main(String[] args){

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addNode(15, "Ian");
        binaryTree.addNode(23, "lawrence");
        binaryTree.addNode(10, "Betty");
        binaryTree.addNode(30, "Jalas");
        binaryTree.addNode(5, "Kaylee");

        binaryTree.inOrderTraversal(binaryTree.root);
        System.out.println("\n");
        binaryTree.preOrderTraversal(binaryTree.root);
    }
}
