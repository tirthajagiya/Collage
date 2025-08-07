import java.util.*;
public class Lab_17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enteer A Size OF Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enetr a Elemant:");
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
        }

        if(count>0){
            System.out.println("Array Containes Dulicate Number.");
        }
        else{
            System.out.println("Array NotContaines Dulicate Number.");
            }
    }
}