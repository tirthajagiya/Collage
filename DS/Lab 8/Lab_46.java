import java.util.*;

class prefix{

    public void change(){
        Stack<Character> stack=new Stack<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a string");
        String infix =sc.next();
        String rinfix="";
        for(int i=infix.length()-1;i>=0;i--){
            if(infix.charAt(i)=='('){
                rinfix+=')';
            }
            else if(infix.charAt(i)==')'){
                rinfix+='(';
            }
            else{
                rinfix+=infix.charAt(i);
            }
        }
        rinfix+=')';
        stack.push('(');
        String polish="";
        int rank=0;
        char temp;
        for(char c : rinfix.toCharArray()){
            while((G(stack.peek()))>(F(c))){
                temp=stack.pop();
                polish+=temp;
                rank+=R(temp);
                if(rank<1){
                    System.out.println("Invalid String.");
                    return;
                }
            }
            if(G(stack.peek())!=F(c)){
                    stack.push(c);
                }
                else{
                    stack.pop();
                }
        }
        if(rank!=1){
            System.out.println("Invalid");
        }
        else{
            System.out.println("Valid");
        }
        System.out.println(polish);
    }

    private void push(char next) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'push'");
    }

    private char pop() {
        throw new UnsupportedOperationException("Unimplemented method 'pop'");
    }

    private char peek() {
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }

    

    public int F(char next){
        if(next=='+' || next=='-'){
            return 1;
        }
        else if(next=='*' || next=='/'){
            return 3;
        }
        else if(next=='^'){
            return 6;
        }
        else if(next>='a' && next<='z'){
            return 7;
        }
        else if(next=='('){
            return 9;
        }
        else if(next==')'){
            return 0;
        }
        return -1;
    }

    public int G(char next){
        if(next=='+' || next=='-'){
            return 2;
        }
        else if(next=='*' || next=='/'){
            return 4;
        }
        else if(next=='^'){
            return 5;
        }
        else if(next>='a' && next<='z'){
            return 8;
        }
        else if(next=='('){
            return 0;
        }
        return -1;
    }

    public int R(char next){
        if(next=='+' || next=='-'||next=='*' ||next=='/'||next=='^'){
            return -1;
        }
        else if(next>='a' && next<='z'){
            return 1;
        }
        return 0;
    }
}

public class Lab_46{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        prefix objPrefix=new prefix();
        objPrefix.change();
    }
}
