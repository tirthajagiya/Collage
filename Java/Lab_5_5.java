import java.util.*;
public class Lab_5_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Complex n1=new Complex();
        Complex n2=new Complex();
        System.out.println("Enter Number1 Real Part:");
        n1.a=sc.nextDouble();
        System.out.println("Enter Number1 Imagenary Part:");
        n1.i=sc.nextDouble();
        System.out.println("Enter Number2 Real Part:");
        n2.a=sc.nextDouble();
        System.out.println("Enter Number2 Imagenary Part:");
        n2.i=sc.nextDouble();
        System.out.println(Complex.additiona(n1,n2));
        System.out.println(Complex.additioni(n1,n2));
    }
}
class Complex{
    double a;
    double i;
    static int count=0;

    Complex(){
        a=0;
        i=0;
    }
    
    static double additiona(Complex n1,Complex n2){
        double w=0;
        w=n1.a+n2.a;
        return w;
    }
    static double additioni(Complex n1,Complex n2){
        double x=0;
        x=n1.i+n2.i;
        return x;
    }
}