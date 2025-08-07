public class Lab_7_5 {
    public static void main(String[] args) {
        Animal[] animal={
            new Tiger(),
            new Camel(),
            new Deer(),
            new Donky()
        };

        for(Animal a:animal){
            if(a instanceof Transport){
                Transport t=(Transport) a;
                t.deliver();
            }
        }
    }
}
interface Transport{
   public void deliver();
}

abstract class Animal{

}

class Tiger extends Animal{

}

class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Camel Deliver.");
    }
}

class Deer extends Animal{

}

class Donky extends Animal implements Transport{
    public void deliver(){
        System.out.println("Camel Deliver.");
    }
}
