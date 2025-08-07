public class circularLinkedList {
    public static void main(String[] args) {
        cll a=new cll();
        a.insertAtFirst(20);
        a.insertAtFirst(10);
        a.insertAtLast(30);
        a.insertAtLast(40);
        a.insertAtOrder(5);
        a.insertAtOrder(45);
        a.insertAtOrder(50);
        a.deleteAtFirst();
        a.deleteAtLast();
        a.displayLinkedList();
    }
}

class cll{
    class Node{
        int info;
        Node link;
        public Node(int info){
            this.info=info;
            this.link=null;
        }
    }
    Node first;
    Node last;
    public void insertAtFirst(int info){
        
        Node newNode=new Node(info);
        if(first==null){
            newNode.link=newNode;
            first=newNode;
            last=newNode;
        }
        else{
            newNode.link=first;
            last.link=newNode;
            first=newNode;
        }
    }

    public void insertAtLast(int info){
        Node newNode=new Node(info);
        if(first==null){
            first=newNode;
            first.link=first;
            last=newNode;
        }
        last.link=newNode;
        newNode.link=first;
        last=newNode;
    }

    public void insertAtOrder(int elemant){
        Node newNode =new Node(elemant);
        if(first==null){
            newNode.link=newNode;
            first=last=newNode;
            return;
        }

        if(first.info>=newNode.info){
            last.link=newNode;
            newNode.link=first;
            first=newNode;
            return;
        }

        Node save=first;

        while(save!=last && (newNode.info>=save.link.info)){
            save=save.link;
        }

        newNode.link=save.link;
        save.link=newNode;

        if(save==last){
            last=newNode;
            return;
        }
    }

    public void deleteAtFirst(){
        if(first==null){
            System.out.println("Linked Is emepty.");
            return;
        }
        first=first.link;
        last.link=first;
    }

    public void deleteAtLast(){
        if(first==null){
            System.out.println("Linked List Is Emepty.");
        }

        Node temp=first;
        while(temp.link!=last){
            temp=temp.link;
        }
        temp.link=first;
        temp=last;
    }

    public void displayLinkedList(){
        Node save=first;
        if(first==null){
            System.out.println("Linked List Is Emepty.");
            return;
        }
        do{
            System.out.println(save.info);
            save=save.link;
        }while(save!=first);
    }
}