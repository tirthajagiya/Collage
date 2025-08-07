public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
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

    public Node first;

    public void insert(int elemant){
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

    public void display(){
        if(first==null){
            System.out.println("Linked List Is Emepty.");
            return;
        }

        Node temp=first;

        while(temp!=null){
            System.out.print(temp.info+"-->");
            temp=temp.link;
        }

        System.out.println("Null");
    }

    public void SortLinkedList(){
        if(first==null){
            System.out.println("Linked List Is Emepty.");
            return;
        }

        Node save=first;
        Boolean bln=false;
        do{
                save=first;
                bln=false;
                while(save.link!=null){
                    if(save.info>save.link.info){
                        int temp=save.info;
                        save.info=save.link.info;
                        save.link.info=temp;
                        bln=true;
                    }
                    save=save.link;
                }  
        }while(bln);
    }
}