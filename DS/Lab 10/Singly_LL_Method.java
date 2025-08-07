import java.util.*;
public class Singly_LL_Method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList ls=new LinkedList();
        int operation;
        do{
            System.out.println("Enter (1) For Insert At First");
            System.out.println("Enter (2) For Insert At Last");
            System.out.println("Enter (3) For Insert At Order List");
            System.out.println("Enter (4) For Delete At First");
            System.out.println("Enter (5) For Delete At Last");
            System.out.println("Enter (6) For Delete Fix Elemant");
            System.out.println("Enter (7) For Count Node");
            System.out.println("Enter (8) For Display");
            System.out.println("Enter (9) For Exit");
            operation=sc.nextInt();
            if(operation==1){
                System.out.println("Which Elemant You Want To Insert At First Position: ");
                int elemant=sc.nextInt();
                ls.insertAtFirst(elemant);
            }
            else if(operation==2){
                System.out.println("Which Elemant You Want To Insert At Last Position: ");
                int elemant=sc.nextInt();
                ls.insertAtLast(elemant);
            }
            else if(operation==3){
                System.out.println("Which Elemant You Want To Insert At Order Linked List: ");
                int elemant=sc.nextInt();
                ls.insertAtOrder(elemant);
            }
            else if (operation==4) {
                ls.deleteAtfirst();
            }
            else if (operation==5) {
                ls.deleteAtLast();
            }
            else if (operation==6) {
                System.out.println("Which Elemant You Want To Delete: ");
                int elemant=sc.nextInt();
                ls.deleteAtOrder(operation);
            }
            else if (operation==7) {
                ls.countNode();
            }
            else if (operation==8) {
                ls.display();
            }
            else if (operation==9) {
                break;
            }
            else{
                System.out.println("Enter A Valid Number For Any Operation");
                System.out.println("");
            }

        }while(operation!=9);
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
    public void insertAtFirst(int info){
        Node newNode=new Node(info);
        newNode.link=first;
        first=newNode;
    }

    public void insertAtLast(int info){
        Node newNode=new Node(info);
        if(first==null){
            first=newNode;
        }
        Node last=first;
        while(last.link!=null){
            last=last.link;
        }
        last.link=newNode;
        last=newNode;
    }

    public void insertAtOrder(int info){
        Node newNode=new Node(info);
        if(first==null || first.info>=newNode.info){
            newNode.link=first;
            first=newNode;
            return;
        }
        Node save=first;
        if(first.link!=null && newNode.info>=save.link.info){
            save=save.link;
        }
        newNode.link=save.link;
        save.link=newNode;
    }

    public void deleteAtfirst(){
        if(first==null){
            System.out.println("Linked List Is Emepty.");
            return;
        }
        first=first.link;
    }

    public void deleteAtLast(){
        if(first==null){
            System.out.println("Linked List Is emepty.");
            return;
        }
        Node temp=first;
        while(temp.link.link!=null){
            temp=temp.link;
        }
        temp.link=null;
    }

    public void deleteAtOrder(int key){
        if(first==null){
            System.out.println("Linked List Is Emepty.");
        }
        Node save=first;
        if(first.info==key){
            first=first.link;
        }

        while(save.link!=null && save.link.info!=key){
            save=save.link;
        }
        if(save.link==null){
            System.out.println("Node Not Found.");
            return;
        }
        save.link=save.link.link;
    }

    public void display(){
        if(first==null){
            System.out.println("Linked List Is Emepty.");
            return;
        }
        Node save=first;
        while(save!=null){
            System.out.println(save.info);
            save=save.link;
        }
        System.out.println("__________________________");
    }

    public void countNode(){
        int count=0;
        if(first==null){
            count=0;
            return;
        }
        Node save=first;
        while(save!=null){
            count++;
            save=save.link;
        }
        System.out.println("Total Number Of Count:"+count);
    }

    // public LinkedList copyLinkedList(){
    //     if(first==null){
    //         System.out.println("Linked List Is Emepty.");
    //     }

    //     LinkedList ls =new LinkedList();
    //     Node save=first;
    //     Node saveCopy=new Node(save.info);
    //     save=save.link;
    //     while(save!=null){
    //         saveCopy=new Node(save.info);
    //         saveCopy=saveCopy.link;
    //         save=save.link;
    //     }
    //     return ls;
    // }


    // public void sortLinkedList(){
    //     if(first==null){
    //         System.out.println("LInked LIst Is Emepty.");
    //         return;
    //     }
    //     Node save;
    //     boolean flag;
    //     do{
    //         save=first;
    //         flag=false;

    //         while(save.link!=null){
    //             if(save.info>save.link.info){
    //                 int temp=save.info;
    //                 save.info=save.link.info;
    //                 save.link.info=temp;
    //                 flag=true;
    //             }
    //             save=save.link;
    //         }

    //     }while(flag);
    // }
    // }
}