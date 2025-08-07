public class copyLinkedList {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        LinkedList ls2=new LinkedList();
        ls.insert(10);
        ls.insert(10);
        ls.insert(10);
        ls.insert(10);
        ls.insert(10);
        ls.display();
        ls.copy(ls2);
    }
}

class LinkedList{
    class Node{
        int info;
        Node link;
        public Node(int info){
            this.info=info;
            this.link=null;
        }
    }
    public Node first;
    public void insert(int data) {
        Node newNode = new Node(data);
        if(first==null){
            first=newNode;
            return; 
        }

        Node currNode=first;
        while (currNode.link!=null) {
            currNode=currNode.link;
        }
        currNode.link=newNode;
    }

    public void display() {
        if (first == null) {
            System.out.println("List is Empty.!");
            return;
        }

        Node currNode = first;
        while (currNode != null) {
            System.out.print(currNode.info + " --> ");
            currNode = currNode.link;
        }
        System.out.println("NULL");
    }

    public void copy(LinkedList list){
        if(first==null){
            System.out.println("Linked List Is Emepty.");
        }
        Node save=first;
        while(save!=null){
            list.insert(save.info);
            save=save.link;
        }
        list.display();
    }
}
