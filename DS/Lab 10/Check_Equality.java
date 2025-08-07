public class Check_Equality{
    public static void main(String[] args) {
        LinkedList ls1=new LinkedList();
        LinkedList ls2=new LinkedList();
        LinkedList ls3=new LinkedList();
        LinkedList ls4=new LinkedList();

        System.out.println("|--------------------|");

        System.out.println("|Case-1              |");
        ls1.insert(10);
        ls1.insert(20);
        ls1.insert(30);

        ls2.insert(10);
        ls2.insert(20);
        ls2.insert(30);

        ls1.display();
        ls2.display();

        ls1.checkEquality(ls1.first, ls2.first);

        System.out.println("|--------------------|");

        System.out.println("|Case-2              |");
        ls3.insert(10);
        ls3.insert(20);
        ls3.insert(30);

        ls4.insert(40);
        ls4.insert(50);
        ls4.insert(60);

        ls3.display();
        ls4.display();

        ls3.checkEquality(ls1.first, ls2.first);

        System.out.println("|--------------------|");

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
    public void insert(int elemant){
        Node newNode=new Node(elemant);
        newNode.link=first;
        first=newNode;
    }

    public void checkEquality(Node n1,Node n2){
        while(n1.link!=null && n2.link!=null){
            if(n1.info!=n2.info){
                System.out.println("|Linked List Are Diffrent.|");
                return;
            }
            n1=n1.link;
            n2=n2.link;
        }
        System.out.println("|Linked List Is Same.|");
    }

    public void display(){
        if(first==null){
            System.out.println("Linked List Is Emepty.");
            return;
        }
        Node temp=first;

        System.out.print("|");

        while(temp!=null){
            System.out.print(temp.info+"-->");
            temp=temp.link;
        }

        System.out.println("Null |");
    }
}