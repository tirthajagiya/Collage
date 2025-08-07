import java.util.*;

public class Lab_6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Student id_no");
        int id_no = sc.nextInt();
        System.out.println("Enter A Total Subject");
        int no_of_subjects_registered = sc.nextInt();

        Student stu = new Student(no_of_subjects_registered);

        for (int i = 0; i < no_of_subjects_registered; i++) {
            System.out.println("Enter " + (i + 1) + " Sub Name:");
            stu.subject[i] = sc.next();
            System.out.println("Enter " + stu.subject[i] + " Credit:");
            stu.subject_credits[i] = sc.nextInt();
            System.out.println("Enter " + stu.subject[i] + " Grade:");
            stu.grade_obtained[i] = sc.next();
        }
        stu.calculateSpi();
    }
}

class Student {
    int id_no;
    int no_of_subjects_registered;
    String[] subject;
    int subject_credits[];
    String grade_obtained[];
    double spi;

    Student(int no_of_subjects_registered) {
        this.no_of_subjects_registered = no_of_subjects_registered;
        subject = new String[no_of_subjects_registered];
        subject_credits = new int[no_of_subjects_registered];
        grade_obtained = new String[no_of_subjects_registered];
        
    }

    public void calculateSpi() {
        int total_credit = 0;
        int sum_credit = 0;
        for (int i = 0; i < no_of_subjects_registered; i++) {
            total_credit += subject_credits[i];
            if (grade_obtained[i].equals("A+")) {
                sum_credit += subject_credits[i] * 9;
            } else if (grade_obtained[i].equals("A")) {
                sum_credit += subject_credits[i] * 8;
            } else if (grade_obtained[i].equals("B+")) {
                sum_credit += subject_credits[i] * 7;
            } else if (grade_obtained[i].equals("B")) {
                sum_credit += subject_credits[i] * 6;
            } else if (grade_obtained[i].equals("C")) {
                sum_credit += subject_credits[i] * 5;
            }
            else {
                System.out.println("not valid grades!!");
            }

        }
        spi = sum_credit / (double)(total_credit);
        System.out.println("SPI:" + spi);
    }
}