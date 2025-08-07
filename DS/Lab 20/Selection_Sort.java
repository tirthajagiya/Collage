import java.util.*;
public class Selection_Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter A Size Of Array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter A ("+(i+1)+") Elemant");
            arr[i]=sc.nextInt();
        }

        int min_index=0;

        for(int i=0;i<arr.length-1;i++){
            min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            if(min_index!=i){
                int temp=arr[i];
                arr[i]=arr[min_index];
                arr[min_index]=temp;
            }
        }

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
}