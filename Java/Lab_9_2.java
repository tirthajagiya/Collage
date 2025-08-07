public class Lab_9_2{
    public static void main(String[] args){
        Thread t1=new OddNumber();
        Thread t2=new EvenNumber();

        t1.start();
        t2.start();
    }
}

class OddNumber extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            if(i%2==0){
                System.out.println("Number "+(i+1)+" Is Odd");
            }
        }
    }
}

class EvenNumber extends Thread{
    public void run(){
        for(int i=0;i<20;i++){
            if(i%2!=0){
                System.out.println("Number "+(i+1)+" Is Even");
            }
        }
    }
}