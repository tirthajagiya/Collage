public class LLusingStack {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.push(10);
        ls.push(20);
        ls.push(30);
        ls.push(40);
        ls.push(50);
        ls.pop();
        ls.pop();
        ls.display();
    }
}
class LinkedList{
    class Node{
        int data;
        Node link;
        public Node(int data){
            this.data=data;
            this.link=null;
        }
    }

    Node first=null;
    public void push(int data){
        Node newNode =new Node(data);
        if(first==null){
            first=newNode;
            return;
        }
        newNode.link=first;
        first=newNode;
    }

    public void pop(){
        if(first==null){
            System.out.println("Stack Is Emepty.");
        }
        first=first.link;
    }

    public void display(){
        if(first==null){
            System.out.println("Linked List Is Emepty.");
            return;
        }
        Node temp=first;
        while (temp!=null) {
            System.out.println(temp.data);
                temp=temp.link;
        }
    }
}