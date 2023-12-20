package lesson18.lessoncode.inheritance.shape;

public class Triangle extends Shape {

    private double sideA ;

    public Triangle(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }


    @Override
    String getTitle() {
        return super.getTitle();
    }

    @Override
    double calculatorArea() {
        return (Math.sqrt(3) * sideA * sideA) / 4;
    }

    @Override
    double calculatorPerimeter() {
        return 3 * sideA;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                '}';
    }
}
