package dz_test;

public class TriangleCalculation {
    public static double calculateTriangleSquare(int a, int b, int c) throws Exception {
        if (a <= 0 || b <= 0 | c <= 0) throw new Exception();
        if (a + b <= c || a + c <= b || b + c <= a)
            throw new Exception();
        double halfPerimeter = (a + b + c) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }
}
