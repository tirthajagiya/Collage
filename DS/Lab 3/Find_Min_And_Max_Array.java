import java.util.*;
public class Lab_16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enteer A Size OF Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enetr a Elemant:");
            arr[i]=sc.nextInt();
        }
        int small=arr[0];
        for(int i=0;i<size;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        int big=arr[0];
        for(int i=0;i<size;i++){
            if(big<arr[i]){
                big=arr[i];
            }
        }

        for(int i=0;i<size;i++){
            System.out.println("Big:"+big);
            System.out.println("Small:"+small);
        }
    }
}