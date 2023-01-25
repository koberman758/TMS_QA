package HW1;

public class Triangle implements Figure {
    private int a;
    private int b;
    private int c;

    @Override
    public double calculateSqare() {
        double p = calculatePerimeter();
        return Math.sqrt((p - a) * (p - b) * (p - c) * p);
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }
}
