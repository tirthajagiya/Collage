import java.util.*;

public class Binary_Search_Recursive_Approach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter A Size Of Array: ");
        int size=sc.nextInt();

        int arr[]=new int[size];

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter A ("+(i+1)+") Elemant");
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter A Elemant You To Search: ");
        int key=sc.nextInt();

        int left=0;
        int right=arr.length-1;

        int ans=Searching(arr,key,left,right);

        if(ans==-1){
            System.out.println("Your Searching Elemant Is Not In Array.");
        }else{
            System.out.println("Your Searching Elemant Index Is :" +ans);
        }
    }
    
    public static int Searching(int arr[],int key,int left,int right){
        int middle;

        while(left<=right){
            middle=(right+left)/2;
            if(arr[middle]==key){
                return middle;
            }
            else if(arr[middle]<key){
                return Searching(arr, key, middle+1, right);
            }
            else{
                return Searching(arr, key, left, middle-1);
            }
        }

        return -1;
    }
}
