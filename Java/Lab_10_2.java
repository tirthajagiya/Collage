import java.util.*;
import java.io.*;

public class Lab_10_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which Word you are replace?");
        String Word1 = sc.nextLine();
        System.out.println("After Word");
        String Word2 = sc.nextLine();

        try {
            BufferedReader bw = new BufferedReader(new FileReader("xyz1.txt"));

            BufferedWriter pw = new BufferedWriter(new FileWriter("xyz1.txt"));

            String line, text;
            while ((line = bw.readLine()) != null) {

                text = line.replaceAll(Word1, Word2);

                pw.write(text);

                pw.newLine();
            }

            pw.close();
            bw.close();
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}