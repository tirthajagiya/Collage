import java.util.Scanner;

public class SwapKthNode {
    public static void main(String[] args) {
        LinkedList ls=new LinkedList();
        ls.insert(10);
        ls.insert(20);
        ls.insert(30);
        ls.insert(40);
        ls.insert(50);
        ls.display();
        ls.swapNode();
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

    public int countNode(){
        if(first==null){
            System.out.println("Linked List Is Emepty.");
            return 0;
        }

        Node temp=first;
        int count=0;
        while(temp!=null){
            temp=temp.link;
            count++;
        }

        return count;
    }

    public void swapNode(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter A K-th Value You Want To Change Node: ");
        int k=sc.nextInt();
        if(first==null){
            System.out.println("Linked List Is Emepty.");
            return;
        }

        if(k>0 && k<=countNode()){
            if(k==1  || k==countNode()){
                Node temp=first;
                while(temp.link!=null){
                    temp=temp.link;
                }
                int temp2=first.info;
                first.info=temp.info;
                temp.info=temp2;
                return;
            }
    
            int count1=1;
            Node temp1=first;
            do{
                count1++;
                temp1=temp1.link;
            }while(count1!=k);
    
            int count2=1;
            Node temp2=first;
            do{
                count2++;
                temp2=temp2.link;
            }while(count2!=(countNode()-k+1));
    
            int temp=temp1.info;
            temp1.info=temp2.info;
            temp2.info=temp;
        }
        else{
            System.out.println("Enter A Valid Number For K");
        }
        } 
}