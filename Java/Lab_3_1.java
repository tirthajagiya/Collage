import java.util.*;
public class Lab_3_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,totalmark,sum=0;
        System.out.println("Enter A Paper Mark");
        totalmark=sc.nextInt();
        System.out.println("Enter A Total Subject");
        int totalsub=sc.nextInt();
        int arr[]=new int[totalsub];
        for(i=0;i<totalsub;i++)
        {
            System.out.println("Enter A Mark");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double per=((double)(sum)/(totalsub*totalmark))*100;
        if(per<40)           
        {
            System.out.println("Fail");
        }
        else if(per<=49 && per>=40)
        {
            System.out.println("Third Division");
        }
        else if(per<=59 && per>=50)
        {
            System.out.println("Second Division");
        }
        else if(per>=60)
        {
            System.out.println("First Class");
        }
    }
    
}