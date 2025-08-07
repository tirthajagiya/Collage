import java.util.*;
public class Lab_3_3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,cou=0;
        System.out.println("Enter A Number");
        int a=sc.nextInt();
        for(i=2;i<=(a/2);i++)
        {
            if(a%i==0)
            {
                cou++;
            }
        }
        if(cou==0)
        {
            System.out.println("Prime.");
        }
        else
        {
            System.out.println("Not Prime.");
        }
    }
}
