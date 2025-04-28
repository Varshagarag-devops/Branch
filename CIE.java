public class CIE {

    void addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    void division(int a, int b) {
        int result = a / b;
        System.out.println("Division: " + result);
    }

    public static void main(String[] args) {
        CIE c1 = new CIE();
        c1.addition(7, 3);
        c1.subtraction(20, 5);
        c1.multiplication(4, 4);
        c1.division(14, 7);
    }
}