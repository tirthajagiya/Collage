import java.util.*;
    public class Maxnumber{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter 1 Number:");
            int num1=sc.nextInt();
            System.out.print("Enter 2 Number:");
            int num2=sc.nextInt();
            System.out.print("Enter 3 Number:");
            int num3=sc.nextInt();
            if(num1>num2 && num1>num3)
            {
                System.out.println("Num 1 Is Biggest Number.");
            }
            else if(num2>num1 && num2>num3)
            {
                System.out.println("Num 2 Is Biggest Number.");
            }
            else if(num3>num2 && num3>num1)
            {
                System.out.println("Num 3 Is Biggest Number.");
            }
        }
    }