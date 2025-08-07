public class Make_Node {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        n1.displayNode();

        Node n2 = new Node(20);
        n2.displayNode();

        Node n3 = new Node(30);
        n3.displayNode();
    }
}

class Node {
    int info;
    Node link;

    public Node(int info) {
        this.info = info;
        this.link = null;
    }

    public void displayNode() {
        System.out.println("Node Is: " + info);
    }
}