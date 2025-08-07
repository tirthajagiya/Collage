import java.util.Scanner;

public class CqInsert_CqDelete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Length Of Queue Here:");
        int size=sc.nextInt();
        QueueImplForCQ qImpl=new QueueImplForCQ(size);
        int operation;
        do{
            System.out.println("Enter (1) For Enqueue Operation");
            System.out.println("Enter (2) For Dequeue Operation");
            System.out.println("Enter (3) For End All Operation");
            operation=sc.nextInt();
            if(operation==1){
                System.out.println("Enter A Elemant You Want To Insert By Enqueue: ");
                int insertelemant=sc.nextInt();
                qImpl.cq_Insert(insertelemant);
                qImpl.display();
            }
            else if(operation==2){
                qImpl.cq_Delete();
                qImpl.display();
            }
            else if (operation==3) {
                System.out.print("Final Queue--> ");
                qImpl.display();
                break;
            }
            else{
                System.out.println("Enter A Valid Number For Any Operation");
                System.out.println("");
            }

        }while(operation!=3);
    
    }
}

class QueueImplForCQ{
    int size;
    int[] queue;
    int front=-1;
    int rear=-1;

    public QueueImplForCQ(int size){
        this.size=size;
        queue=new int[size];
    }

    public void cq_Insert(int elemant){
        if(rear==size-1){
            if(front==0){
                System.out.println("Queue Overflow.");
                return;
            }
            rear=0;
        }
        else{
            rear++;
        }

        queue[rear]=elemant;

        if(front==-1){
            front=0;
            return;
        }
    }

    public void cq_Delete(){
        if(front==-1){
            System.out.println("Queue Underflow.");
            return;
        }

        if(front==rear){
            front=-1;
            rear=-1;
            return;
        }
        
        if(front==size-1){
            front=0;
        }
        else{
            front++;
        }
    }

    public void display(){
        if(front==-1){
            System.out.println("Queue Underflow.");
            return;
        }

        int i=front;

        while(true){
            System.out.print(queue[i]+",");
            if(i==rear){
                break;
            }

            i=(i+1)%size;
        }
    }
}