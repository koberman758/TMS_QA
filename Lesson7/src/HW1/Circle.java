package HW1;

public class Circle implements Figure {

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    private int r;

    @Override
    public double calculateSqare() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * r * Math.PI;
    }

    public void setR(int r) {
        this.r = r;
    }
}
