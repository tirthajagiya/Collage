import java.util.*;
public class Number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Number:");
        int num=sc.nextInt();
        if(num>=0)
        {
            System.out.println("Number Is Positive.");
        }
        else
        {
            System.out.println("Number Is Negative.");
        }
    }
}
