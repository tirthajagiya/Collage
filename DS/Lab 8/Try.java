import java.util.Scanner;
import java.util.Stack;

public class Try {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.println("Enter A Expression: ");
        String infix = sc.nextLine();
        infix += ")";
        stack.push('(');
        String polish = "";
        int rank = 0;
        int index = 0;
        char temp;

        for (int i = 0; i < infix.length(); i++) {
            char next = infix.charAt(index);
            while ((G(stack.peek())) > (F(next))) {
                temp = stack.pop();
                polish += temp;
                rank += R(temp);

                if (rank < 1) {
                    System.out.println("Invalid.");
                    return;
                }
            }

            if (G(stack.peek()) != F(next)) {
                stack.push(next);
            } else {
                stack.pop();
            }
            index++;
        }

        if (rank != 1) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }

        System.out.println(polish);

    }

    public static int F(char next) {
        if (next == '+' || next == '-') {
            return 1;
        } else if (next == '*' || next == '/') {
            return 3;
        } else if (next == '^') {
            return 6;
        } else if (next >= 'a' && next <= 'z') {
            return 7;
        } else if (next == '(') {
            return 9;
        } else if (next == ')') {
            return 0;
        }
        return -1;
    }

    public static int G(char next) {
        if (next == '+' || next == '-') {
            return 2;
        } else if (next == '*' || next == '/') {
            return 4;
        } else if (next == '^') {
            return 5;
        } else if (next >= 'a' && next <= 'z') {
            return 8;
        } else if (next == '(') {
            return 0;
        }
        return -1;
    }

    public static int R(char next) {
        if (next == '+' || next == '-' || next == '*' || next == '/' || next == '^') {
            return -1;
        } else if (next >= 'a' && next <= 'z') {
            return 1;
        }
        return 0;
    }
}