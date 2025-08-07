import java.util.*;

public class Lab_4_8 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = (n - 1); j >= 0; j--) {
                if (j > i) {
                    System.out.print(" ");
                } else if (j <= i) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

        for (i = (n - 1); i >= 0; i--) {
            for (j = (n - 1); j >= 0; j--) {
                if (j >= i) {
                    System.out.print(" ");
                } else if (j < i) {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
