public class Practice{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        System.out.println(sumOfAllElement(arr));
        int arr2[]=smallestAndLargest(arr);
    }

    public static int sumOfAllElement(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        return sum;
    }

    public static int[] smallestAndLargest(int[] arr){
        int small=0;
        int largest=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
            else if(arr[i]>largest){
                largest=arr[i];
            }
        }

        return new int[]{small,largest};
    }
}