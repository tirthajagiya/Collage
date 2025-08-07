public class List_into_two_halves_in_CLL {
    public static void main(String[] args) {
        CLlimpl a=new CLlimpl();
        CLlimpl b=new CLlimpl();
        CLlimpl c=new CLlimpl();
        a.insert(10);
        a.insert(20);
        a.insert(30);
        a.insert(40);
        a.insert(50);
        // a.insert(60);
        a.splitHalves(b,c);
    }
}

class CLlimpl{
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

    public void insert(int elemant){
        Node newNode=new Node(elemant);

        if(first==null){
            first=newNode;
            first.link=first;
            last=newNode;
        }
        else{
            newNode.link=first;
            last.link=newNode;
            last=newNode;
        }
    }

    public void display(){
        Node temp=first;
        if(first==null){
            System.out.println("Linked List Is Emepty.");
            return;
        }
        do{
            System.out.print(temp.info+"->");
            temp=temp.link;
        }while(temp!=first);

        System.out.println();
    }

    public int countNode(){
        if(first==null){
            System.out.println("Linked List IS Emepty.");
            return 0;
        }

        int count=0;
        Node temp=first;

        do{
            count++;
            temp=temp.link;
        }while(temp!=first);

        return count;
    }

    public void splitHalves(CLlimpl cll1,CLlimpl cll2){
        if(first==null){
            System.out.println("Linked List Is Emepty.");
            return;
        }

        if(first.link==first){
            System.out.println("Linked List Have A Single Node.");
            return;
        }

        int count1=(countNode())/2;
        int count2=0;
        Node temp=first;

        while(count2!=count1){
            cll1.insert(temp.info);
            temp=temp.link;
            count2++;
        };

        while(countNode()!=(count2+1)){
            cll2.insert(temp.info);
            temp=temp.link;
            count2++;
        };

        cll2.insert(temp.info);

        display();
        System.out.println("-------");
        cll1.display();
        System.out.println("-------");
        cll2.display();
    }
}