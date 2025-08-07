import java.util.Date;

public class Tirth {
    public static void main(String[] args) {
        Date sDate = new Date();
        long start1 = 1;
        long end1 = 1000000000L;
        long ans1 = 0;

        MyThread mt1 = new MyThread(start1, (end1) / 3);
        MyThread mt2 = new MyThread((end1) / 3, (2 * (end1)) / 3);
        MyThread mt3 = new MyThread(((2 * (end1)) / 3), end1);

        mt1.start();
        mt2.start();
        mt3.start();

        try {
            mt1.join();
            mt2.join();
            mt3.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Date eDate = new Date();

        long totalTime = eDate.getTime() - sDate.getTime();

        long totalans = mt1.ans + mt2.ans + mt3.ans;

        System.out.println("Total-" + totalans);
        System.out.println("Total-Time-" + totalTime);
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