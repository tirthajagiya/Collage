import java.util.*;
public class Day_Into_YYMMDD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Day:");
        int day=sc.nextInt();
        int week=0;
        int year=0;

        while(day>=6){
            if(week>=52){
                year++;
                week-=52;
            }
            else if(day>=7){
                week++;
                day-=7;
            }
        }

        System.out.println(year+":"+week+":"+day);
    }
}

