public class Binary_Search_Tree {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(10);
        bst.insert(5);
        bst.insert(3);
        bst.insert(4);
    }
}

class BST {
    class Node {
        int info;
        Node lptr;
        Node rptr;

        public Node(int info) {
            this.info = info;
            this.lptr = null;
            this.rptr = null;
        }
    }

    Node root = null;

    public Node insert(int info) {
        Node newNode = new Node(info);

        if (root == null) {
            root = newNode;
            System.out.println("Root Insert");
            return root;
        }

        Node temp = root;

        while (temp != null) {
            if (temp.info == newNode.info) {
                break;
            }
            if (temp.info > newNode.info) {
                if (temp.lptr == null) {
                    temp.lptr = newNode;
                    System.out.println("Left");
                    break;
                } else {
                    temp = temp.lptr;
                }
            } else if (temp.info < newNode.info) {
                if (temp.rptr == null) {
                    temp.rptr = newNode;
                    System.out.println("Right");
                    break;
                } else {
                    temp = temp.rptr;
                }
            }
        }
        return root;
    }
}