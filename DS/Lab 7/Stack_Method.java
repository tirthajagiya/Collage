import java.util.*;

class StackImpl {
    int top = -1;
    int stack[];
    int n;

    public StackImpl(int n) {
        this.n = n;
        stack = new int[n];
    }

    public void push(int elemant) {
        if (top >= n) {
            System.out.println("Stack Overflow.");
            return;
        }
        top = top + 1;
        stack[top] = elemant;
    }

    public int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow.");
        }
        top = top - 1;
        return stack[top + 1];
    }

    public void display() {
        for (int i = top; i >= 0; i--) {
            System.out.println("|" + stack[i] + "|");
            System.out.println("----");
        }

    }

    public int peep(int key) {
        if (top - key + 1 < 0) {
            System.out.println("Stack Underflow.");
            return -1;
        }
        return stack[top - key + 1];
    }

    public void change(int elemant, int key) {
        if (top - key + 1 < 0) {
            System.out.println("Stack Underflow.");
            return;
        }

        stack[top - key + 1] = elemant;
    }
}

public class Stack_Method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Size Of Stack:");
        int n = sc.nextInt();
        StackImpl s = new StackImpl(n);
        int opration;
        do {
            System.out.println("Enter Following Digits For Operations\n");
            System.out.println("1 for push()");
            System.out.println("2 for pop()");
            System.out.println("3 for peep()");
            System.out.println("4 for change()");
            System.out.println("5 for display()");
            System.out.println("6 for exit");
            System.out.println("enter A Digit for operation:");
            opration = sc.nextInt();

            if (opration == 1) {
                System.out.println("Enter A Elemant For Push In Stack You Want:");
                int elemant = sc.nextInt();
                s.push(elemant);
            }

            else if (opration == 2) {
                s.pop();
            }

            else if (opration == 3) {
                System.out.println("Which Elemant You Want to Show");
                int key = sc.nextInt();
                System.out.println(" ");
                System.out.println(s.peep(key));
                System.out.println(" ");
            } else if (opration == 4) {
                System.out.println("Enter a Elemant to chage:");
                int elemant = sc.nextInt();
                System.out.println("Enetr A Index:");
                int key = sc.nextInt();
                s.change(elemant, key);
            }

            else if (opration == 5) {
                s.display();
            }

            else if (opration == 6) {
                break;
            }

            else {
                System.out.println("Enter A Valid Number For Proper Operation.");
            }
        } while (opration != 6);
    }
}