
import java.util.*;
public class Lab_2_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A First Number:");
        int a=sc.nextInt();
        System.out.println("Enter A Second Number:");
        int b=sc.nextInt();
        System.out.println("Enter A Opretion:");
        String str=sc.next();
        if(str=="+")
        {
            int d=a+b;
            System.out.println(""+d);
        }
        else if(str=="-")
        {
            int e=a-b;
            System.out.println(""+e);
        }
        else if(str=="*")
        {
            int f=a*b;
            System.out.println(""+f);
        }
        else if(str=="/")
        {
            int g=a/b;
            System.out.println(""+g);
        }
    }
}