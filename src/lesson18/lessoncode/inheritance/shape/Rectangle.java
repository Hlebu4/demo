package lesson18.lessoncode.inheritance.shape;

public class Rectangle extends Shape{
    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    String getTitle() {
        return getTitle();
    }

    @Override
    public double calculatorArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatorPerimeter() {
        return 2 * (sideA + sideB);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
