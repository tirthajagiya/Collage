import java.util.*;
public class TechNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Any Number");
        int n=sc.nextInt();
        int p=n;
        int count=0;
        for(int i=0;n!=0;i++){
            n=n/10;
            count++;
        }
        System.out.print(""+count);
    }
}
