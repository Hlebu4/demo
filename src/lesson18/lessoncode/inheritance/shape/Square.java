package lesson18.lessoncode.inheritance.shape;

public class Square extends Shape{

    private double sideA;

    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    @Override
    String getTitle() {
        return getTitle();
    }

    @Override
    public double calculatorArea() {
        return sideA * sideA;
    }

    @Override
    public double calculatorPerimeter() {
        return 4 * sideA;
    }
}
