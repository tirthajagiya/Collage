import java.util.Scanner;;
public class Lab_15 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter A Size Of Array:");
        int size=sc.nextInt();

        int arr[]=new int[size];

        int small=arr[0];
        for(int i=0;i<size;i++){
            System.out.println("Enter a "+i+" elemant:");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<size;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }

        int large=arr[0];

        for(int i=0;i<size;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }

        System.out.println("Smallest Value: "+small+" Largest Value: "+large+" .");
    }
}
