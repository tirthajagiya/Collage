class circulerLinkedList{
    class Node{
        int data;
        Node link;
        public Node(int data){
            this.data=data;
            this.link=null;
        }}
        Node first=null;
        public void insert(int data){
            Node newNode=new Node(data);
            Node temp=first;
            if(first==null){
                first=newNode;
                first.link=first;
                return;
            }
            while(temp.link!=first){
                temp=temp.link;
            }
    
            temp.link=newNode;
            newNode.link=first;
    
        }
    
        public void display(){
           int count=1;
           Node temp=first;
           while(temp.link!=first){
            count++;
            temp=temp.link;
           }
           System.out.println("Total Number Of Node In Linked List Are: "+count);
        }
}

public class Count_Node_In_CCL {
    public static void main(String[] args) {
        circulerLinkedList stack=new circulerLinkedList();
        stack.insert(10);
        stack.insert(20);
        stack.insert(30);
        stack.insert(40);
        stack.insert(50);
        stack.display();
    }
}