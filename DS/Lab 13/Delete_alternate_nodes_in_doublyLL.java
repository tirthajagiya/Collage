public class Delete_alternate_nodes_in_doublyLL {
    public static void main(String[] args) {
        Doubly_LinkedList_Implemant dll = new Doubly_LinkedList_Implemant();
        dll.insert(10);
        dll.insert(20);
        dll.insert(30);
        dll.insert(40);
        // dll.insert(50);
        dll.display();
        dll.delete_alternate_nodes();
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

    public void insert(int elemamnt) {
        Node newNode = new Node(elemamnt);

        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.lptr = last;
            last.rptr = newNode;
            last = newNode;
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

    public void delete_alternate_nodes() {
        if (first == null) {
            System.out.println("Linked List Is Emepty.");
            return;
        }

        Node save = first;
        Node delete = save.rptr;

        while (save.rptr != null && delete.rptr != null) {
            save.rptr = delete.rptr;
            delete.rptr.lptr = save;

            save = save.rptr;
            delete = save.rptr;
        }

        if (delete != null && delete.rptr == null) {
            save.rptr = null;
        }
    }
}
