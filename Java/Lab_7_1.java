public class Lab_7_1{
    public static void main(String[] args) {
        Potato p1=new Potato("Yellow");
        Brinjal b1=new Brinjal("Purple");
        Tomato t1=new Tomato("Red");
        p1.toString();
        b1.toString();
        t1.toString();
    }
}
abstract class Vegetable{
    String color;
    Vegetable(String color){
        this.color=color;
    }
    public abstract String toString();
}
class Potato extends Vegetable{
    String name="Potato";
    Potato(String color){
        super(color);
    }
    public String toString(){
        return name+" Color Is "+color;
    }
}

class Brinjal extends Vegetable{
    String name="Brinjal";
    Brinjal(String color){
        super(color);
    }
    public String toString(){
        return name+" Color Is "+color;
    }
}
class Tomato extends Vegetable{
    String name="Red";
    Tomato(String color){
        super(color);
    }
    public String toString(){
        return name+" Color Is "+color;
    }
}