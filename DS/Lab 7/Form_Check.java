import java.util.Scanner;

public class Form_Check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();
        Stack a=new Stack(str.length());
        Stack b=new Stack(str.length());
        for(char ch:str.toCharArray()){
            if(ch=='a'){
                a.push(1);
            }
            else if(ch=='b'){
                b.push(0);
            }
        }
        if(a.top==b.top){
            System.out.println("valid String");
        }
        else{
            System.out.println("Invalid String.");
        }
    }
}
class Stack{
    int top;
    int size;
    int[] stackArray;

    public Stack(int size){
        this.size=size;
        stackArray=new int[size];
    }
    public void push(int elemant){
        if(stackArray.length<=top){
            System.out.println("Stack Overflow");
            return;
        }
        else{
            top++;
            stackArray[top]=elemant;
        }
    }
}