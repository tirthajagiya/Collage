import java.util.Scanner;

import javax.swing.plaf.synth.SynthIcon;
import javax.swing.plaf.synth.SynthViewportUI;
public class Second_Convert_HHMMSS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Second:");
        int sec=sc.nextInt();
        int hour=0;
        int min=0;

        while(sec>60){
            if(min>=60){
                hour++;
                min-=60;
            }
            else if(sec>=60){
                min++;
                sec-=60;
            }
        }

        System.out.println(hour+":"+min+":"+sec);
    }
}
