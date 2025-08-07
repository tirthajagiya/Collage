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
    public void insert(int info){
        Node newNode=new Node(info);
        if(first==null){
            first=newNode;
            return;
        }
        Node temp=first;
        while(temp.link!=null){
            temp=temp.link;
        }
        temp.link=newNode;
    }

    public void display() {
        if (first == null) {
            System.out.println("List is Empty.!");
            return;
        }

        Node currNode= first;
        while (currNode != null) {
            System.out.print(currNode.info + " --> ");
            currNode = currNode.link;
        }
        System.out.println("NULL");
    }

    public void reverseLinkedList(){
        if(first==null){
            System.out.println("Linked List Is emepty.");
            return;
        }
        
        Node prev=first;
        Node save=first.link;

        while(save!=null){
            Node temp=save.link;
            save.link=prev;
            prev=save;
            save=temp;
        }

        first.link=null;
        first=prev;
    }
}

public class ReverseLinkedList{
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
        ls.insert(40);
        ls.insert(50);
        ls.display();
        ls.reverseLinkedList();
        ls.display();
    }
}