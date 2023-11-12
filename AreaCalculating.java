public class AreaCalculating {
    public static void main(String[] args) {
        double a = 5.5;
        double b = 6.21;
        areaCalculate(a, b);
        perimeterCalculate(a, b);
    }

    private static void perimeterCalculate(double a, double b) {
        double perimeter = 2 * (a + b);
        System.out.println("Chu vi là: " + perimeter);
    }

    private static void areaCalculate(double a, double b) {
        double area = a * b;
        System.out.println("Dien tich là: " + area);
    }
}
