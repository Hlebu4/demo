package lesson18.lessoncode.inheritance.shape;

public class Circle extends Shape{

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    String getTitle() {
        return super.getTitle();
    }

    @Override
    public double calculatorArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatorPerimeter() {
        return Math.PI * 2 * radius;
    }
}
