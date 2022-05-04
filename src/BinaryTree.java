public class BinaryTree {

    public Node root;

    public void addNode(int key, String value){
        Node newNode = new Node(key, value);
        if (this.root == null){
            this.root = newNode;
        }else{
            Node focusNode = this.root;
            Node parent = null;
            while(true){
                parent = focusNode;
                if(key < focusNode.key){
                    focusNode = focusNode.leftChild;
                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else{
                    focusNode = focusNode.rightChild;
                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }

    public void inOrderTraversal(Node rootNode){
        if(rootNode != null){
            this.inOrderTraversal(rootNode.leftChild);
            rootNode.printMessage();
            this.inOrderTraversal(rootNode.rightChild);
        }
    }

    public void preOrderTraversal(Node rootNode){
        if(rootNode != null){
            rootNode.printMessage();
            this.preOrderTraversal(rootNode.leftChild);
            this.preOrderTraversal(rootNode.rightChild);
        }
    }
}
