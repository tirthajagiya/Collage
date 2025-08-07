public class Doubly_LinkedList {
    public static void main(String[] args) {
        Doubly_LinkedList_Implemant dll = new Doubly_LinkedList_Implemant();

        dll.insertAtFirst(20);
        dll.insertAtFirst(10);
        dll.insertAtLast(30);
        dll.insertAtLast(40);
        dll.display();
        dll.delete(10);
        dll.display();
        dll.delete(40);
        dll.display();
        dll.insertAtLast(50);
        dll.delete(40);
        dll.display();
    }
}

class Doubly_LinkedList_Implemant {
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

    Node first;
    Node last;

    public void insertAtFirst(int elemant) {
        Node newNode = new Node(elemant);

        if (first == null) {
            first = newNode;
            last = newNode;
            return;
        }

        newNode.rptr = first;
        first.lptr = newNode;
        first = newNode;
    }

    public void insertAtLast(int elemant) {
        Node newNode = new Node(elemant);

        if (first == null) {
            first = newNode;
            last = newNode;
            return;
        }

        last.rptr = newNode;
        newNode.lptr = last;
        last = newNode;
    }

    public void delete(int elemant) {
        if (first == null) {
            System.out.println("Linked List Is Emepty.");
            return;
        }

        if (elemant == first.info) {
            first = first.rptr;
            first.lptr = null;
            return;
        }

        if (elemant == last.info) {
            last = last.lptr;
            last.rptr = null;
            return;
        }

        if (first == last) {
            first = null;
            last = null;
            return;
        }

        Node save = first;

        while (save.info != elemant && save != last) {
            save = save.rptr;
        }

        if (save.rptr == null) {
            System.out.println("Node Not Found");
            return;
        } else {
            save.lptr.rptr = save.rptr;
            save.rptr.lptr = save.lptr;
        }
    }

    public void display() {
        if (first == null) {
            System.out.println("Linked List Is Emepty.");
            return;
        }

        Node save = first;

        while (save != null) {
            System.out.print(save.info + "<->");
            save = save.rptr;
        }

        System.out.println("Null");
    }
}