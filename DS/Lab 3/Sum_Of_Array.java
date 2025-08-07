import java.util.*;
public class Lab_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Length Of Array");
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("Enter A "+(i+1)+" Elemant");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.println((i+1)+" Elemant "+arr[i]);
        }
    }
}