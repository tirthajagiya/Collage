import java.io.*;
import java.util.*;

public class Lab_11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filename = "xyz.txt";
        System.out.println("Enter A Number Of Student");
        int n = sc.nextInt();
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            for (int i = 1; i <= n; i++) {
                String name;
                int age;
                System.out.println("Enter A " + (i) + " Student name:");
                name = sc.next();
                System.out.println("Enter A " + (i) + " age:");
                age = sc.nextInt();

                bw.write(name+","+age);
                bw.newLine();
            }

            bw.close();

            BufferedReader br = new BufferedReader(new FileReader(filename));

            String line;

            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                String name = temp[0];
                int age = Integer.parseInt(temp[1]);
            }
        }

        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Student1 {
    String name;
    int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(String name, int age) {
        return "Name " + name + ",Age " + age;
    }
}
