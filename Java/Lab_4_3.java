import java.util.*;
public class Lab_4_3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,sum=0,avg;
        int arr[]=new int[5];
        for(i=0;i<5;i++)
        {
            System.out.println("Enter A Number:");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        avg=sum/5;
        System.out.println("Sum:"+sum);
        System.out.println("Avarage:"+avg);
    }
}