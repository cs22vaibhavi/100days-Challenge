class Main {

    // Circle
    // Parameter: double r
    // Return type: double
    static double area(double r) {
        return 3.14 * r * r;
    }

    // Rectangle
    // Parameters: int l, int b
    // Return type: int
    static int area(int l, int b) {
        return l * b;
    }

    // Triangle
    // Parameters: double b, double h
    // Return type: double
    static double area(double b, double h) {
        return 0.5 * b * h;
    }

    public static void main(String[] args) {

        System.out.println("Circle = " + area(5.0));
        System.out.println("Rectangle = " + area(10, 5));
        System.out.println("Triangle = " + area(10.0, 5.0));
    }
}
