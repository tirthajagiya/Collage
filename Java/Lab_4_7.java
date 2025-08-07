import java.util.*;
public class Lab_4_7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<=i;j++){
                char ch=str.charAt(j);
                System.out.print(""+ch); 
            }
            System.out.println("");
        }
    }
}
