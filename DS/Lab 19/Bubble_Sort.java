import java.net.SocketPermission;
import java.util.*;
public class Bubble_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter A Size Of Array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter A ("+(i+1)+") Elemant");
            arr[i]=sc.nextInt();
        }

        bubbleSort(arr);

        System.out.println("-------Array-------");
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                System.out.print(arr[i]+",");
            }
            else{
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }

    public static void bubbleSort(int arr[]){
        int last=(arr.length)-1;
        for(int i=0;i<arr.length-1;i++){
            int count=0;
            for(int j=0;j<last;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    count++;
                }
            }
            if(count==0){
                System.out.println("Array Is Already Sorted.");
                break;
            }
            else{
                last--;
            }
        }
    }
}
