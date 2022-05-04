public class Node {

    public int key;
    public String value;
    public Node leftChild;
    public Node rightChild;

    public Node(int key, String value){
        this.key = key;
        this.value = value;
    }

    public void printMessage(){
        System.out.println("Key => "+this.key+" Value => "+this.value);
    }
}
