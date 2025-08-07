import java.util.Scanner;

public class Merge_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Size Of Array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter A (" + (i + 1) + ") Elemant");
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = arr.length - 1;
        Sort_By_Merge_Sort(arr, low, high);

        System.out.println("-------Array-------");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.print("]");
    }

    public static void Sort_By_Merge_Sort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            Sort_By_Merge_Sort(arr, low, mid);
            Sort_By_Merge_Sort(arr, mid + 1, high);
            marge(arr, low, mid, high);
        }
    }

    public static void marge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int h = low;
        int i = low;
        int j = mid + 1;

        while (h <= mid && j <= high) {
            if (arr[h] <= arr[j]) {
                temp[i] = arr[h];
                h++;
            } else {
                temp[i] = arr[j];
                j++;
            }
            i++;
        }

        if (h > mid) {
            for (int k = j; k <= high; k++) {
                temp[i] = arr[k];
                i++;
            }
        } else {
            for (int k = h; k <= mid; k++) {
                temp[i] = arr[k];
                i++;
            }
        }

        for (int k = low; k <= high; k++) {
            arr[k] = temp[k];
        }

    }
}
