import java.util.*;
public class Lab_5_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Radius");
        double radius=sc.nextDouble();
        circle circle1=new circle(radius);
        System.out.println("Area Of Circle:"+circle1.calculateArea());
    }
}

class circle{
    double radius;
    circle(double radius){
        this.radius=radius;
    }
   double calculateArea(){
        return Math.PI*radius*radius;
   }
}
