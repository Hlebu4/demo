package lesson18.lessoncode.inheritance.shape;

abstract class Shape {
    private String title;

    public Shape(String title) {
        this.title = title;
    }

    // должен бы быть метод для расчета площади геометрической фигуры и периметра


    String getTitle() {
        return title;
    }

    abstract double calculatorArea();

    abstract double calculatorPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "title='" + title + '\'' +
                '}';
    }
}
