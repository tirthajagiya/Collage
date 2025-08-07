public class Lab_9_1 {
    public static void main(String[] args) {
        Runnable r1=new MorningGreet();
        Runnable r2=new AfternoonGreet();

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);  
        
        t1.start();
        t2.start();
    }
}

class MorningGreet implements Runnable{
    public void run(){
        try{
            while(true){
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class AfternoonGreet implements Runnable{
    public void run(){
        try{
            while(true){
                System.out.println("Good Afternoon");
                Thread.sleep(3000);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}