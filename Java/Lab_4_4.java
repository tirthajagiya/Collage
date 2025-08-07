import java.util.*;
public class Lab_4_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int len,i;
        System.out.println("Enter A Array Length:");
        len=sc.nextInt();
        int arr[]=new int[len];
        for(i=0;i<len;i++)
        {
            System.out.println("Enter A Number");
            arr[i]=sc.nextInt();
        }
        for(i=len-1;i>=0;i--)
        {
            System.out.println("Reverce Number:"+arr[i]);
        }
    }   
}
