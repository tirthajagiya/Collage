import java.util.Scanner;
public class AttendanceDemo {
    public static void main(Strings[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter !st roll no of class");
        int firstRoll=sc.nextInt();
        int absentNos[]=new int[200];
        int totalabsent=0;
        int currentrollno = firstRoll;
        while(currentrollno > 0){
            System.out.println("Press 1 For Present and 0");
            int temp = sc.nextInt();
            if(temp==0){
                absentNos[totalabsent] = currentrollno;
                totalabsent++;
            }
            else if()
        }
    }
}
