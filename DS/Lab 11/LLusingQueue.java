public class LLusingQueue {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.enQueue(10);
        ls.enQueue(20);
        ls.enQueue(30);
        ls.deQueue();
        ls.deQueue();
        ls.display();
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

    Node first=null;

    public void enQueue(int elemant){
        Node newNode=new Node(elemant);

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

    public void deQueue(){
        if(first==null){
            System.out.println("Queue is Emepty.");
            return;
        }

        first=first.link;
    }

    public void display(){
        if(first==null){
            System.out.println("Queue is Emepty.");
            return;
        }

        Node temp=first;

        while (temp!=null) {
            System.out.println(temp.info);
            temp=temp.link;
        }
    }
}