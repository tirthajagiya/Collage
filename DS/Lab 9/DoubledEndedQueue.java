import java.util.*;

public class DoubledEndedQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Size Of Queue: ");
        int size=sc.nextInt();
        QueueImpl qImpl=new QueueImpl(size);
        int a;
        do{
            System.out.println("Enter A (1) For Insert At Front End: ");
            System.out.println("Enter A (2) For Insert At Rear End: ");
            System.out.println("Enter A (3) For Delete At Front End: ");
            System.out.println("Enter A (4) For Delete At Rear End: ");
            System.out.println("Enter A (5) For Break: ");
            a=sc.nextInt();

            if(a==1){
                System.out.println("Enter A Elemant You Want To Insert: ");
                int elemant=sc.nextInt();
                qImpl.Insert_at_front_end(elemant);
                qImpl.display();
            }

            else if(a==2){
                System.out.println("Enter A Elemant You Want To Insert: ");
                int elemant=sc.nextInt();
                qImpl.Insert_at_rear_end(elemant);
                qImpl.display();
            }

            else if(a==3){
                qImpl.Delete_from_front_end();
                qImpl.display();
            }

            else if(a==4){
                qImpl.Delete_from_rear_end();
                qImpl.display();
            }

            else if(a==5){
                break;
            }
        }while(a!=5);
    }
}

class QueueImpl{
    int[] queue;
    int front=-1;
    int rear=-1;
    int size;

    QueueImpl(int size){
        this.size=size;
        queue=new int[size];
    }

    public void Insert_at_front_end(int elemant){
        if(front==0){
            System.out.println("Queue Overflow.");
            return;
        }

        if(front==-1){
            front=0;
            rear=0;
        }
        else{
            front=front-1;
        }
    }

    public void Insert_at_rear_end(int elemant){
        if(rear>=size-1){
            System.out.println("Queue Overflow");
            return;
        }

        rear=rear+1;
        queue[rear]=elemant;

        if(front==-1){
            front=0;
        }
    }

    public void Delete_from_front_end(){
        if(front==-1){
            System.out.println("Queue Underflow.");
            return;
        }

        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front=front+1;
        }
    }

    public void Delete_from_rear_end(){
        if(rear==-1){
            System.out.println("Queue Underflow.");
            return;
        }

        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            rear=rear-1;
        }
    }

public void display(){
    if(front==-1){
        System.out.println("Queue Underflow");
        return;
    }
    for(int i=front;i<=rear;i++){
        System.out.println(queue[i]+",");
    }
}

}