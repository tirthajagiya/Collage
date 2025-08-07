import java.util.*; 
public class Lab_6_3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Member m1=new Member();
        System.out.println("Enter 1st Member Name:");
        m1.Name=sc.nextLine();
        System.out.println("Enter 1st Member Age:");
        m1.age=sc.nextInt();
        System.out.println("Enter 1st Member Mobile Number:");
        m1.pn=sc.nextInt();
        System.out.println("Enter 1st Member Address:");
        m1.Address=sc.nextLine();
        m1.printDetails();
        m1.printSalary();
    }
}
class Member{
    String Name;
    int age;
    int pn;
    String Address;
    int salary;
    
    void printDetails(){
        System.out.println("Name:"+Name);
        System.out.println("Age:"+age);
        System.out.println("Phone Number"+pn);
        System.out.println("Address"+Address);
    }

    void printSalary(){
        System.out.println("Salary:"+salary);
    } 
}

class Employee extends Member{
    String Department;
}

class Manager extends Member{
    String Specialization;
}