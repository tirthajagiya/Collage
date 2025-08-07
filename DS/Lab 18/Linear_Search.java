import java.util.*;
public class Linear_Search{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter A Size Of Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter A ("+(i+1)+") Elemant");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter A Elemant To Search: ");
        int key=sc.nextInt();

        int ans=Searching(arr, key);

        if(ans==-1){
            System.out.println("Your Searching Elemant Is Not In Array.");
        }else{
            System.out.println("Your Searching Elemant Index Is :" +ans);
        }
    }

    public static int Searching(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}