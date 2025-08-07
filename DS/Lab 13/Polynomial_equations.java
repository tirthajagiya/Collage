public class Polynomial_equations {
    public static void main(String[] args) {
        Polynomial p1=new Polynomial();
        Polynomial p2=new Polynomial();

        p1.writeEqution(1,2);
        p1.writeEqution(1, 1);
        p1.writeEqution(1,0);

        p2.writeEqution(-1, 2);
        p2.writeEqution(2, 1);
        p2.writeEqution(-3, 0);

        Polynomial ans=p1.addEqu(p1, p2);

        ans.display();
    }
}

class Polynomial {
    class Node {
        int coefficient;
        int exponent;
        Node link;

        public Node(int coefficient,int exponent){
            this.coefficient=coefficient;
            this.exponent=exponent;
            this.link=null;
        }
    }

    Node first;

    public void writeEqution(int coefficient,int exponent){
        Node newNode=new Node(coefficient, exponent);
        if(first==null){
            first=newNode;
            return;
        }

        Node save=first;

        while (save.link!=null) {
            save=save.link;
        }

        save.link=newNode;
    }
    
    public void display(){
        if(first==null){
            System.out.println("Any Equation Are Not Available.");
            return;
        }

        Node temp=first;

        while (temp!=null) {
            System.out.print(temp.coefficient+"x^"+temp.exponent);
            if(temp.link!=null){
                System.out.print("+");
            }
            temp=temp.link;
        }
        System.out.println();
    }

    public Polynomial addEqu(Polynomial p1,Polynomial p2){
        Polynomial result=new Polynomial();

        Node t1=p1.first;
        Node t2=p2.first;

        while(t1!=null && t2!=null){
            if(t1.exponent==t2.exponent){
                result.writeEqution(t1.coefficient+t2.coefficient, t1.exponent);
                t1=t1.link;
                t2=t2.link;
            }else if(t1.exponent>t2.exponent){
                result.writeEqution(t1.coefficient,t1.exponent);
                t1=t1.link;
            }else{
                result.writeEqution(t2.coefficient,t2.exponent);
                t2=t2.link;
            }
        }

        while(t1!=null){
            result.writeEqution(t1.coefficient, t1.exponent);
            t1=t1.link;
        }

        while(t2!=null){
            result.writeEqution(t2.coefficient, t2.exponent);
            t2=t2.link;
        }

        return result;
    }
}