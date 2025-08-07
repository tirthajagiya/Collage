import java.util.*;
public class Lab_4_5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String");
        String a=sc.nextLine();
        int i;
        for(i=0;i<=(a.length())/2;i++)
        {
            System.out.print(a.charAt(i));
        }
    }
}
