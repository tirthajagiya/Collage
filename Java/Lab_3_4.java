import java.util.*;
public class Lab_3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,count=0;
        System.out.println("Enter A Number"); 
        n=sc.nextInt();
        for(i=2;(n/2)>i;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("Number Is Prime.");
        }
        else{
            System.out.println("Number Is Not Prime.");
        }
    }
}
