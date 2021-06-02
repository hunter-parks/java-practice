public class math_in_java {
    public static void main(String[] args) {

        System.out.println("sum() = " + sum(5,5));
        System.out.println("divide() = " + divide(100,50));
        System.out.println("square() = " + square(2));
    }

    // Get the sum of two numbers

    public static int sum(int a, int b) {
        return a + b;
    }

    // Dividing two numbers

    public static int divide(int a, int b) {
        return a / b;
    }

    // Squaring a number

    public static double square(int a) {
        return a * a;
    }
}
