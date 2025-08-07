import java.util.Date;

public class Tirth2 {
    public static void main(String[] args) {
        Date sDate = new Date();
        long start1 = 1;
        long end1 = 10000000000L;
        MyThread mt1=new MyThread(start1, end1);
        
        try {
            mt1.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Ans:" + mt1.ans);
        Date eDate = new Date();

        long totalTime = eDate.getTime() - sDate.getTime();
  
        System.out.println("Totaltime-" + totalTime);
    }
}

class MyThread extends Thread {
    long start;
    long end;
    long ans = 0;

    public MyThread(long start, long end) {
        this.start = start;
        this.end = end;
    }

    public void run() {

        for (long i = start; i < end; i++) {
            ans += i;
        }
    }
}
