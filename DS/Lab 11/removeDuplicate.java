public class removeDuplicate {
    public static void main(String[] args) {
        SinglyLinkedList ls=new SinglyLinkedList();
        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
        ls.insert(30);
        ls.removeDuplicate();
        ls.display();
    }
}

class SinglyLinkedList{
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
    public void removeDuplicate(){
        
        if(first==null){
            System.err.println("linked List Is Emepty.");
            return;
        }
        
        Node temp=first;
        Node save=first;
    
        while(temp!=null){
            save=temp;
            while(save.link!=null){
                if(save.link.info==temp.info){
                    save.link=save.link.link;
                }
                else{
                    save=save.link;
                }
            }
            temp=temp.link;
        }
    }
}
