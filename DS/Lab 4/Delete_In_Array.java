import java.util.*;
public class Lab_22 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter A Size Of Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Which Index Insert:");
        int b=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter Elemant Here:");
            arr[i]=sc.nextInt();
        }
        int[] arr2=new int[size-1];
        for(int i=0;i<size;i++){
            if(i<b){
                arr2[i]=arr[i];
            }
            else if(i>b){
                arr2[i-1]=arr[i];
            }
            else if(i==b){
                continue;
            }
        }
        System.out.print("[");
        for(int i=0;i<size-1;i++){
            System.out.print(arr2[i]+",");
        }
        System.out.print("]");
    }
}