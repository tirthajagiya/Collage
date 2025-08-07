import java.util.Scanner;
public class Lab_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A N:");
        int n=sc.nextInt();
        int ans=(n*(n+1)*(n+2))/6;
        System.out.println(ans);
    }
}
