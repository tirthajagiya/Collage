import java.util.Scanner;

public class Insertion_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Size Of Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter A (" + (i + 1) + ") Elemant");
            arr[i] = sc.nextInt();
        }

        Sort_By_Insertion_Sort(arr);

        System.out.println("-----Array-----");

        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
                System.out.print(arr[i]+",");
            }
            else{
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }

    public static void Sort_By_Insertion_Sort(int[] arr){
        int key;
        int j;
        for(int i=0;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
}