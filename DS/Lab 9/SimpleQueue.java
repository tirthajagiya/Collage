import java.util.*;
public class SimpleQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Length Of Queue Here:");
        int size=sc.nextInt();
        QueueImpl qImpl=new QueueImpl(size);
        int operation;
        do{
            System.out.println("Enter (1) For Enqueue Operation");
            System.out.println("Enter (2) For Dequeue Operation");
            System.out.println("Enter (3) For Display Queue");
            System.out.println("Enter (4) For End All Operation");
            operation=sc.nextInt();
            if(operation==1){
                System.out.println("Enter A Elemant You Want To Insert By Enqueue: ");
                int insertelemant=sc.nextInt();
                qImpl.enqueue(insertelemant);
            }
            else if(operation==2){
                qImpl.dequeue();
            }
            else if(operation==3){
                System.out.println("________________________");
                qImpl.display();
            }
            else if (operation==4) {
                break;
            }
            else{
                System.out.println("Enter A Valid Number For Any Operation");
                System.out.println("");
            }

        }while(operation!=4);
    }
}

class QueueImpl{
    int front=-1;
    int rear=-1;
    int n;
    int[] queue;

    public QueueImpl(int n){
        this.n=n;
        queue=new int[n];
    }

    public void enqueue(int elemant){
        if(rear>=n-1){
            System.out.println("Queue Overflow.");
            return;
        }
        rear=rear+1;
        queue[rear]=elemant;

        if(front==-1){
            front=0;
        }
    }

    public void dequeue(){
        if(front==-1){
            System.out.println("Queue Underflow.");
            return ;
        }
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front=front+1;
        }
    }

    public void display(){
        if(front==-1){
            System.out.println("Queue Underflow.");
            return;
        }
        for(int i=front;i<=rear;i++){
            if(i!=rear){
                System.out.print(queue[i]+", ");
            }
            else{
                System.out.println(queue[i]);
            }
        }
    }
}