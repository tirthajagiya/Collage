public class mcq_test {

    public static void main(String[] args) {
        //String str = (String) i;
        try {
            System.out.println(1/0);
        } catch (IllegalArgumentException,ArithmeticException,ArrayIndexOutOfBoundsException e) {
            System.out.println("world");
        }
    }
}