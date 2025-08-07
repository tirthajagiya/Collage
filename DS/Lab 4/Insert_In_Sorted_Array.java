import java.util.*;
public class Lab_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Array Of Size:");
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter a elemant");
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Which elemant add:");
        int n=sc.nextInt();

        int arr2[]=new int[size+1];

        for(int i=0;i<size;i++){
            if(arr[i]<=n && arr[i+1]>n){
                arr2[i+1]=n;
            }
            else if(arr[i]<n){
                
            }
        }

        for(int i=0;i<size+1;i++){
            System.out.println(arr2[i]);
        }
    }
}
