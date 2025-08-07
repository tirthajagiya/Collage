public class Tirth3 {
    public static void main(String[] args) {
        Runnable r1=new Mythread("Good Morning",1000);
        Runnable r2=new Mythread("Good Afternoon",3000);

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();
    }
}

class Mythread implements Runnable{
    String Message;
    int delay;
    Mythread(String Message,int delay){
        this.Message=Message;
        this.delay=delay;
    }

    public void run(){
        try{
            while(true){
                System.out.println(""+Message);
                Thread.sleep(delay);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
