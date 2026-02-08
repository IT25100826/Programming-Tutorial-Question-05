public class Calculator {

    // add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // square of a number
    public int square(int a) {
        return a * a;
    }

    // main method
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        // (3 * 4 + 5 * 7)²
        int result1 = cal.square(
                cal.add(
                        cal.multiply(3, 4),
                        cal.multiply(5, 7)
                )
        );

        // (4 + 7)² + (8 + 3)²
        int result2 = cal.add(
                cal.square(cal.add(4, 7)),
                cal.square(cal.add(8, 3))
        );

        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
    }
}
