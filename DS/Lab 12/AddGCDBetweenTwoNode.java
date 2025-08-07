public class AddGCDBetweenTwoNode {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.insert(18);
        ls.insert(6);
        ls.insert(10);
        ls.insert(3);
        ls.display();
        ls.gcdAdd();
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

    public void gcdAdd(){
        if(first==null){
            System.out.println("Linked List Is Emepty.");
            return;
        }

        Node temp=first;

            while(temp.link!=null){
                int gcd=Math.min(temp.info, temp.link.info);

            while(gcd>0){
                if(temp.info%gcd==0 && temp.link.info%gcd==0){
                    break;
                }
                gcd--;
            }

                Node newNode =new Node(gcd);
                newNode.link=temp.link;
                temp.link=newNode;
                temp=temp.link.link;
            }
    }
}