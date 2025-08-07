import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Number Of Student");
        int a=sc.nextInt();
        Student stu[]=new Student[a];
        for(int i=0;i<stu.length;i++){
            stu[i]=new Student();
        }
        for(int i=0;i<stu.length;i++){
            if(stu[i].Mark>80){
                stu[i].stuDetail();
            }
        }
    }
}
class Student{
    String Name;
    int Mark;
    Scanner sc2=new Scanner(System.in);
    public Student(){
        System.out.println("Enter A Name:");
        Name=sc2.nextLine();
        System.out.println("Enter A Mark:");
        Mark=sc2.nextInt();
    }
    public void stuDetail(){
        System.out.println(Name+" got "+Mark +"Mark In The Java");
    }
}