import java.util.*;
import java.util.Stack;

public class Recognize{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String: ");
        String str = sc.nextLine().toLowerCase();
        Stack<Character> stack = new Stack<>();
        stack.push('c');
        int index = 0;
        char next = str.charAt(index);

        if (str.charAt(str.length() - 1) != ' ') {
            str = str + ' ';
        }

        while (next != 'c') {
            if (next == ' ') {
                System.out.println("Invalid String.");
                return;
            } else {
                stack.push(next);
                index++;
                next = str.charAt(index);
            }
        }

        while (stack.peek() != 'c') {
            index++;
            next = str.charAt(index);
            int elemant = stack.pop();

            if (next != elemant) {
                System.out.println("Invalid String.");
                return;
            }
        }

        index++;
        next = str.charAt(index);

        if (next == ' ') {
            System.out.println("Valid String.");
        } else {
            System.out.println("Invalid String.");
        }

    }
}
