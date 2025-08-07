import java.util.*;
public class Lab_5_2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A First Time Hour");
        int h1=sc.nextInt();
        System.out.println("Enter A First Time Minute");
        int m1=sc.nextInt();
        System.out.println("Enter A Second Time Hour");
        int h2=sc.nextInt();
        System.out.println("Enter A Second Time Minute");
        int m2=sc.nextInt();
        Time t1=new Time(h1,m1);
        Time t2=new Time(h2,m2);
        Time.addition(t1.hour,t2.minute,t1.hour,t2.minute);
    }
}
class Time{
    int hour;
    int minute;
    Time(int hour,int minute){
        this.hour=hour;
        this.minute=minute;
    }
    static void addition(int hour1,int minute1,int hour2,int minute2){
        int totalhour=hour1+hour2;
        int totalminute=minute1+minute2;
        System.out.println(totalhour+ ":" +totalminute);
    }
}