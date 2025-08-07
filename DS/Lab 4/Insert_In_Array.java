import java.util.*;
public class Lab_21 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter A Size Of Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Which Number Insert:");
        int a=sc.nextInt();
        System.out.println("Which Index Insert:");
        int b=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.println("Enter Elemant Here:");
            arr[i]=sc.nextInt();
        }
        int[] arr2=new int[size+1];
        for(int i=0;i<size;i++){
            if(i<b){
                arr2[i]=arr[i];
            }
            else if(i>b){
                arr2[i+1]=arr[i];
            }
            else if(i==b){
                arr2[i]=a;
            }
        }
        for(int i=0;i<=size;i++){
            System.out.println(arr2[i]);
        }
    }
}
